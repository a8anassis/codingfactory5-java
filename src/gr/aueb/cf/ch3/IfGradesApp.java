package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελέγχει ένα βαθμό και αντίστοιχα
 * δίνει output (Excellent, Very Good, Good, Fail)
 */
public class IfGradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please insert grade");
        grade = scanner.nextInt();

        if (grade >= 8) {   // <= 10
            System.out.println("Excellent");
        } else if (grade >= 6) {
            System.out.println("Very Good");
        } else if (grade >= 4) {
            System.out.println("Pass");
        } else {    // >= 0 && <= 3
            System.out.println("Fail");
        }
    }
}
