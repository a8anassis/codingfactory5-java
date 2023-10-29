package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν θα ανάψει τα φώτα ή όχι
 * με βάση 1) _αν βρέχει_, 2) _αν είναι σκοτεινά_
 * και 3) αν η _ταχύτητα_ είναι > 100 χιλ.
 * Τις τιμές τις δίνει ο χρήστης από το
 * stdin.
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean isRunning = false;
        boolean lightsOn = false;

        System.out.println("Please insert if is raining (true/false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = scanner.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = scanner.nextInt();

        isRunning = speed > MAX_SPEED;
        lightsOn = isRaining && (isDark || isRunning);      // short-circuit

        System.out.println("Lights on: " + lightsOn);
    }
}
