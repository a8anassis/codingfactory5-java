package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το a^n με while. Π.χ.
 * Το 2^10 = 1024, το 3^3 = 27
 */
public class PowerApp {

    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result *= base;
            i++;
        }
        System.out.println("Result: " + result);
    }
}
