package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει δύο ακεραίους και
 * υπολογίζει το πηλίκο.
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert the numerator");
            numerator = scanner.nextInt();

            System.out.println("Please insert the denominator");
            denominator = scanner.nextInt();

            if (numerator != 0) {
                if (denominator != 0) {
                    result = numerator / denominator;
                } else {
                    System.out.println("Denominator can not be zero");
                    break;
                }
            } else {
                System.out.println("Numerator can not be zero");
                break;
            }

            System.out.println("Result: " + result);
        }
    }
}
