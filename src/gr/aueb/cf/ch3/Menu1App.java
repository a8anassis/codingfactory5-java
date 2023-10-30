package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζεται εξακολουθητικά ένα μενού στον χρήστη
 * με επιλογές μέχρι να δώσει 3 (Quit).
 */
public class Menu1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. One Player Game");
            System.out.println("2. Two Player Game");
            System.out.println("3. Έξοδος");
            System.out.println("Δώστε επιλογή");

            choice = scanner.nextInt();

            if (choice <= 0 || choice >= 4) {
                System.out.println("Λάθος επιλογή");
                continue;
            }

            if (choice == 3) {
                System.out.println("Έξοδος ...");
                break;
            }

            if (choice == 1) {
                System.out.println("One Player Game starting ...");
            } else {    // if (choice == 2)
                System.out.println("Two Player Game starting ...");
            }
        }
    }
}
