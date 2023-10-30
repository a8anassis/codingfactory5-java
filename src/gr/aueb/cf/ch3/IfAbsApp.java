package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει ένα αριθμό από τον χρήστη
 * και επιστρέφει το απόλυτο του αριθμού.
 */
public class IfAbsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please insert a num");
        num = scanner.nextInt();

        // Ternary Operator - Τριαδικός τελεστής
        abs = (num >= 0) ? num : -num;

       /* if (num >= 0) {
            abs = num;
        } else {
            abs = -num;
        }*/

        System.out.println("Abs of: " + num + " is: " + abs);
    }
}
