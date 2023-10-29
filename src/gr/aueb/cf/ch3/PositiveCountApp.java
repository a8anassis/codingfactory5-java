package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Όσο ο χρήστης δίνει  ακεραίους
 * τους μετράμε μέχρι ο χρήστης να δώσει
 * -1 (sentinel value).
 */
public class PositiveCountApp {

    public static void main(String[] args) {
        int inputNum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a num (-1 for Quit)");
        inputNum = scanner.nextInt();

        while (inputNum != -1) {
            count++;
            System.out.println("Please insert a num (-1 for Quit)");
            inputNum = scanner.nextInt();
        }

        System.out.println("Count: " + count);
    }
}
