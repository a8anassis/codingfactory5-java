package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το 1 + 2 + .. + n,
 * όπου το n το δίνει ο χρήστης.
 */
public class SumGenApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endValue = 0;
        int i = 1;
        int result = 0;

        System.out.println("Please insert a num (int)");
        endValue = scanner.nextInt();

        while (i <= endValue) {
            result += i;
            i++;
        }
        System.out.printf("Sum 1+2+..+%d = %d", endValue, result);
    }
}
