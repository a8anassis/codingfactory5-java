package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δίνονται δύο βαθμοί και ένα σύνολο και
 * θα πρέπει να βρούμε το μέσο όρο.
 */
public class IfAvgApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade1 = 0;
        int grade2 = 0;
        int total = 0;
        int avg = 0;

        System.out.println("Please insert grade1, grade2, total");
        grade1 = scanner.nextInt();
        grade2 = scanner.nextInt();
        total = scanner.nextInt();

        if (total != 0) {
            avg = (grade1 + grade2) / total;
            if (avg >= 8) {   // <= 10
                System.out.println("Excellent");
            } else if (avg >= 6) {
                System.out.println("Very Good");
            } else if (avg >= 4) {
                System.out.println("Pass");
            } else {    // >= 0 && <= 3
                System.out.println("Fail");
            }
        } else {
            System.out.println("Error: divide by zero!");
        }
    }
}
