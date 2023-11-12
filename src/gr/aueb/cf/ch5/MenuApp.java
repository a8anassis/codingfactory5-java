package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            printMenu();
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Επιτυχής Εισαγωγή");
                    break;
                case 2:
                    System.out.println("Επιτυχής Ενημέρωση");
                    break;
                case 3:
                    System.out.println("Επιτυχής Διαγραφή");
                    break;
                case 4:
                    System.out.println("Επιτυχής Αναζήτηση");
                    break;
                case 5:
                    System.out.println("Έξοδος");
                    break;
                default:
                    System.out.println("Λάθος επιλογή");
                    break;
            }

        } while (choice != 5);
    }

    /**
     * Prints a CRUD menu.
     */
    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Ενημέρωση");
        System.out.println("3. Διαγραφή");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");
    }
}
