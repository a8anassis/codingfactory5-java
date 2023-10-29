package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού, μέχρι ο
 * χρήστης να επιλέξει Quit.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. Εισαγωγή Μαθητή");
            System.out.println("2. Διαγραφή Μαθητή");
            System.out.println("3. Έξοδος");
            choice = scanner.nextInt();
        } while (choice != 3);
    }
}
