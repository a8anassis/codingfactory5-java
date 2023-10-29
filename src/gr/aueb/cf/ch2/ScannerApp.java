package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner Demo. Reads two ints from
 * stdin and prints the sum.
 */
public class ScannerApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        int sum;

        // Εντολές
        System.out.println("Please insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 * num2;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Sum of %d + %d = %d", num1, num2, sum);
    }
}
