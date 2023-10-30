package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει δύο ακεραίους.
 * Θέλουμε να υπολογίζει τον
 * μικρότερο των δύο ακεραίων.
 */
public class MinValueApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please insert two ints");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

       /* if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }*/

        min = (num1 < num2) ? num1 : num2;  // ? :

        System.out.printf("Num1: %d, Num2: %d, Min: %d", num1, num2, min);
    }
}
