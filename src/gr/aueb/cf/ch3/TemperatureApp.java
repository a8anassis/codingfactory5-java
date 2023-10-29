package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αν η θερμοκρασία είναι < 0 τότε
 * η isTempBelowZero γίνεται true,
 * αλλιώς γίνεται false.
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("Please insert temperature");
        temperature = scanner.nextInt();

        isTempBelowZero = (temperature < 0);

        System.out.println("Temp is below zero: " + isTempBelowZero);
    }
}
