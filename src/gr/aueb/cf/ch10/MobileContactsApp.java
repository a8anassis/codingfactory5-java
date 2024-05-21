package gr.aueb.cf.ch10;

import java.util.Arrays;
import java.util.Scanner;

public class MobileContactsApp {

    final static Scanner in = new Scanner(System.in);
    final static String[][] contacts = new String[500][3];
    static int pivot = -1;

    public static void main(String[] args) {

    }

    /*
     * Controllers.
     */

    public static String insertContactController(String[] contact) {
        String response = null;
        String[] errorsArray;

        if (contact == null) return "nullError";

        try {
            errorsArray = validateInsertContact(contact);
            if (!errorsArray[0].isEmpty() || !errorsArray[1].isEmpty() || !errorsArray[2].isEmpty()) {
                for (String message : errorsArray) {
                    response += message + "\n";
                }
                return response;    // validation failure
            }
            insertContactService(contact);
            response = "OK";        // success
        } catch (Exception e) {
            return e.getMessage();  // exception failure
        }
        return response;
    }

    public static String[] validateInsertContact(String[] contact) {
        String[] errorsArray = new String[] {"", "", ""};

        if (!contact[0].matches("\\S+") || contact[0].length() < 2) {
            errorsArray[0] = "invFirstname";
        }
        if (!contact[1].matches("\\S+") || contact[1].length() < 2) {
            errorsArray[1] = "invLastname";
        }
        if (!contact[2].matches("\\S+") || contact[2].length() != 10) {
            errorsArray[2] = "invPhone";
        }
        return errorsArray;
    }

    /*
     * Service Layer.
     */

    public static String[] getContactByPhoneNumberService(String phoneNumber) throws Exception {
        String[] contact;

        try {
            contact = getByPhoneNumber(phoneNumber);
            if (contact.length == 0) {
                throw new Exception("Contact not found");
            }
            return contact;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String[][] getAllContactsService() throws Exception {
        String[][] allContacts;

        try {
            allContacts = getAllContacts();
            if (allContacts.length == 0) {
                throw new Exception("List is empty");
            }
            return allContacts;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void insertContactService(String... contact) throws Exception {
        boolean isInserted = false;
        if (contact.length != 3) return;

        try {
            isInserted = insertContact(contact[0], contact[1], contact[2]);
            if (!isInserted) {
                throw new Exception("Phone already exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void updateContactService(String... contact) throws Exception {
        boolean isUpdated = false;
        if (contact.length != 3) return;

        try {
            isUpdated = updateContact(contact[0], contact[1], contact[2]);
            if (!isUpdated) {
                throw new Exception("Contact not exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void deleteContactService(String phoneNumber) throws Exception {
        boolean isDeleted = false;

        try {
            isDeleted = deleteContact(phoneNumber);
            if (!isDeleted) {
                throw new Exception("Contact not exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }





    /*
     *  CRUD Methods - CRUD Layer.
     */

    public static int getContactIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i <= pivot; i++) {
            if (contacts[i][2].equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isFull(String[][] contacts) {
        return (pivot == contacts.length - 1);
    }

    public static boolean insertContact(String firstname, String lastname, String phoneNumber) {
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

        if (pivot == contacts.length - 1) pivot--;
        System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        pivot--;
        return true;
    }

    public static String[] getByPhoneNumber(String phoneNumber) {
        int position = getContactIndexByPhoneNumber(phoneNumber);

        return (position == -1) ? new String[] {} : contacts[position];
    }

    public static String[][] getAllContacts() {
        return Arrays.copyOf(contacts, pivot + 1);
    }
}
