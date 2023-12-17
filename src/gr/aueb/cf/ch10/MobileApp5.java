package gr.aueb.cf.ch10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class MobileApp5 {
    final static Scanner in = new Scanner(System.in);

    final static String[][] contacts = new String[500][3];
    static int pivot = -1;

    public static void main(String[] args) {
        String choice;
        int inputChoice;
        String response;
        String[] contact;
        String error;
        String phone;

        do {
            printMenu();
            choice = getChoice();
            error = validateChoice(choice);

            if (error.equals("quit")) {
                System.out.println("Goodbye..");
                break;
            }
            if (error.equals("choiceErr")) {
                System.out.println("Invalid choice");
                continue;
            }

            inputChoice = Integer.parseInt(choice);
            switch (inputChoice) {
                case 1:
                    showInputUpdateContactForm();
                    contact = getContact();

                    response = insertContactController(contact);

                    if (!response.equals("OK")) {
                        System.out.println(response);
                        continue;
                    }
                    System.out.println("Request successfully completed");
                    break;
                case 2:
                    // Assume phone is PK and can not be updated.
                    showInputUpdateContactForm();
                    contact = getContact();
                    System.out.println("contact: " + contact.length);
                    response = updateContactController(contact);
                    if (!response.equals("OK")) {
                        System.out.println(response);
                        continue;
                    }
                    System.out.println("Request successfully completed");
                    break;
                case 3:
                    showSearchDeleteContactForm();
                    phone = getPhone();
                    response = deleteContactController(phone);
                    if (!response.equals("OK")) {
                        System.out.println(response);
                        continue;
                    }
                    System.out.println("Request successfully completed");
                    break;
                case 4:
                    showSearchDeleteContactForm();
                    phone = getPhone();
                    response = searchContactController(phone);
                    System.out.println(response);
                    break;
                case 5:
                    response = getAllContactsController();
                    System.out.println(response);
                    break;
            }
        } while (true);

        System.out.println("Thank you for using the Mobile-Contacts Management System");
    }


    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Εισαγωγή Επαφής");
        System.out.println("2. Ενημέρωση Επαφής");
        System.out.println("3. Διαγραφή Επαφής");
        System.out.println("4. Αναζήτηση Επαφής");
        System.out.println("5. Εκτύπωση Επαφών");
        System.out.println("Q/q. Έξοδος");
    }

    public static String getChoice() {
        System.out.println("Εισάγετε επιλογή");
        return in.nextLine().trim();
    }

    /**
     * Validates the format of input.
     *
     * @param choice    the menu choice of the user.
     * @return          an error code.
     */
    public static String validateChoice(String choice) {
        String error = "";
        if (choice.matches("[qQ]")) {
            error = "quit";
        } else if (!choice.matches("[1-5]")) {
            error = "choiceErr";
        }
        return error;
    }

    public static String[] getContact() {
        String[] contact = new String[3];
        contact[0] = getFirstname();
        contact[1] = getLastname();
        contact[2] = getPhoneNumber();
        return contact;
    }
    public static String getFirstname() {
        System.out.println("Εισάγετε Όνομα");
        return in.nextLine().trim();
    }

    public static String getLastname() {
        System.out.println("Εισάγετε Επώνυμο");
        return in.nextLine().trim();
    }

    public static String getPhoneNumber() {
        System.out.println("Εισάγετε Αριθμό Τηλεφώνου");
        return in.nextLine().trim();
    }

    public static void showInputUpdateContactForm() {
        System.out.println("Εισάγετε Όνομα, Επώνυμο, Τηλέφωνο");
    }

    public static void showSearchDeleteContactForm() {
        System.out.println("Εισάγετε Τηλέφωνο");
    }

    public static String getPhone() {
        return in.nextLine().trim();
    }

    /*
     * Controllers and Validators
     */

    /**
     * Gets the data (contact) and routes the request
     * for inserting the contact to the appropriate service.
     * First, validates the input. Returns appropriate error
     * response for success or failure.
     *
     * @param contact
     * @return
     */
    public static String insertContactController(String[] contact) {
        String[] errorsArray;
        String response = "";

        if (contact == null) return "nullError";

        try {
            errorsArray = validateInputContact(contact);

            if (!errorsArray[0].isEmpty() || !errorsArray[1].isEmpty() || !errorsArray[2].isEmpty()) {
                for (String message : errorsArray) {
                    response += message + "\n";
                }
                return response;
            }
            insertContactService(contact);
            response = "OK";
        } catch (Exception e) {
            return e.getMessage();
        }
        return response;
    }

    public static String updateContactController(String[] contact) {
        String[] errorsArray;
        String response = "";

        if (contact == null) return "nullError";

        try {
            errorsArray = validateUpdateContact(contact);
            if (!errorsArray[0].isEmpty() || !errorsArray[1].isEmpty() || !errorsArray[2].isEmpty()) {
                for (String message : errorsArray) {
                    response += message + "\n";
                }
                return response;
            }
            updateContactService(contact);
            response = "OK";
        } catch (Exception e) {
            return e.getMessage();
        }

        return response;
    }

    public static String deleteContactController(String phone) {
        String error;
        String response = "";

        if (phone == null) return "nullError";

        try {
            error = validateSearchDeleteContact(phone);
            if (!error.isEmpty()) {
                response += error + "\n";
                return response;
            }
            deleteContactService(phone);
            response = "OK";
        } catch (Exception e) {
            return e.getMessage();
        }

        return response;
    }

    public static String searchContactController(String phone) {
        String error;
        StringBuilder response = new StringBuilder();

        if (phone == null) return "nullError";

        try {
            error = validateSearchDeleteContact(phone);
            if (!error.isEmpty()) {
                response.append(error).append("\n");
                return response.toString();
            }
            String[] contact = getContactByPhoneNumberService(phone);
            for (String item : contact) {
                response.append(item).append("\n");
            }
        } catch (Exception e) {
            return e.getMessage();
        }
        return response.toString();
    }

    public static String getAllContactsController() {
        StringBuilder response = new StringBuilder();

        try {
            String[][] allContacts = getAllContactsService();
            for (String[] contact : allContacts) {
                response.append(Arrays.toString(contact));
                response.append("\n");
            }
        } catch (Exception e) {
            return e.getMessage();
        }
        return response.toString();
    }

    public static String[] validateInputContact(String[] contact) {
        String[] errorsArray = new String[] {"", "", ""};
        if (!contact[0].matches("^\\S+$") || contact[0].length() < 2) {
            errorsArray[0] = "invFirstname";
        }
        if (!contact[1].matches("^\\S+$") || contact[1].length() < 2) {
            errorsArray[1] = "invLastname";
        }
        if (!contact[2].matches("^\\S+$") || contact[2].length() != 10) {
            errorsArray[2] = "invPhone";
        }
        return errorsArray;
    }

    public static String[] validateUpdateContact(String[] contact) {
        String[] errorsArray = new String[] {"", "", ""};
        if (!contact[0].matches("^\\S+$") || contact[0].length() < 2) {
            errorsArray[0] = "invFirstname";
        }
        if (!contact[1].matches("^\\S+$") || contact[1].length() < 2) {
            errorsArray[1] = "invLastname";
        }
        if (!contact[2].matches("^\\S+$") || contact[2].length() != 10) {
            errorsArray[2] = "invPhone";
        }
        if (getContactByPhoneNumber(contact[2]).length == 0) {
            errorsArray[2] += " contact not Exists";
        }
        return errorsArray;
    }

    public static String validateSearchDeleteContact(String phone) {
        String error = "";

        if (!phone.matches("^\\S+$") || phone.length() != 10) {
            error = "invPhone";
        }
        return error;
    }




    /*public static void printContacts(String[][] contacts) {
        for (String[] contact : contacts) {
            System.out.printf("%s\t%s\t%s\n", contact[0], contact[1], contact[2]);
        }
    }*/


    /*
     * Service Layer - services provided to the client
     */
    public static String[] getContactByPhoneNumberService(String phoneNumber) throws Exception {
        try {
            String[] contact = getContactByPhoneNumber(phoneNumber);
            if (contact.length == 0) {
                throw new Exception("Contact not found");
            } else {
                return contact;
            }
        } catch (Exception e) {
            log(e);
            throw e;
        }
    }

    public static String[][] getAllContactsService() throws Exception {
        String[][] contacts = getAllContacts();

        try {
            if (contacts.length == 0) throw new Exception("List is empty");
            return contacts;
        } catch (Exception e) {
            log(e);
            throw e;
        }
    }

    public static void insertContactService(String... contact) throws Exception {
        try {
            if (!insertContact(contact[0], contact[1], contact[2])) {
                throw new Exception("Error in insert");
            }
        } catch (Exception e) {
            log(e);
            throw e;
        }
    }

    public static void updateContactService(String... contact) throws Exception {
        try {
            if (!updateContact(contact[0], contact[1], contact[2])) {
                throw new Exception("Update Error");
            }
        } catch (Exception e) {
            log(e);
            throw e;
        }
    }

    public static void deleteContactService(String phoneNumber) throws Exception {
        try {
            if (!deleteContact(phoneNumber)) {
                throw new Exception("Error in delete");
            }
        } catch (Exception e) {
            log(e);
            throw e;
        }
    }


    /*
     * CRUD Services
     */

    public static int getContactIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i <= pivot; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean insertContact(String firstname, String lastname, String phoneNumber) {
        boolean inserted = false;

        if (isFull(contacts)) return false;
        if (getContactIndexByPhoneNumber(phoneNumber) != -1) {
            return false;
        }
        pivot++;
        contacts[pivot][0] = firstname;
        contacts[pivot][1] = lastname;
        contacts[pivot][2] = phoneNumber;
        return true;
    }

    public static boolean isFull(String[][] contacts) {
        return (pivot == contacts.length - 1);
    }

    public static boolean updateContact(String firstname, String lastname, String phoneNumber) {
        int positionToUpdate = getContactIndexByPhoneNumber(phoneNumber);

        if (positionToUpdate == -1) {
            return false;
        }
        contacts[positionToUpdate][0] = firstname;
        contacts[positionToUpdate][1] = lastname;
        return true;
    }

    public static boolean deleteContact(String phoneNumber) {
        int positionToDelete = getContactIndexByPhoneNumber(phoneNumber);

        if (positionToDelete == -1) {
            return false;
        }
        if (positionToDelete != pivot) {
            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        }
        pivot--;
        return true;
    }

    public static String[] getContactByPhoneNumber(String phoneNumber) {
        int positionToReturn = getContactIndexByPhoneNumber(phoneNumber);

        return (positionToReturn == -1) ? new String[] {} : contacts[positionToReturn];
    }

    public static String[][] getAllContacts() {
        return Arrays.copyOf(contacts, pivot + 1);
    }

    /*
     * Custom Logger
     */
    public static void log(Exception e, String... messages) throws IOException {
        final Path path = Paths.get("C:/tmp/log-mobile.txt");
        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))) {
            ps.println(LocalDateTime.now() + "\n" + e + "\n");
            ps.printf("%s", (messages.length == 1) ? messages[0] : "");
        } catch (IOException ex) {
            //ex.printStackTrace();
            System.err.println(ex.getMessage());
            throw ex;
        }
    }
}
