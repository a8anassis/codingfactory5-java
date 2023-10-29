package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δίνει ο χρήστης (stdin) το πλήθος
 * των stars (οριζόντια εκτύπωση).
 */
public class StarsGenericApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stars = 0;
        int i = 1;

        System.out.println("Please insert stars count");
        stars = scanner.nextInt();

        while (i <= stars) {
            System.out.print("*");
            i++;
        }
    }
}
