package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το φόρο ανάλογα με το
 * ύψος των πωλήσεων.
 */
public class IfTaxApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAX_LIMIT = 1000;
        final int LOW_RATE = 10;
        final int HIGH_RATE = 25;
        int total = 0;
        int jan = 0;
        int feb = 0;
        int mar = 0;
        int apr = 0;
        int tax = 0;

        System.out.println("Please insert the amounts");
        jan = scanner.nextInt();
        feb = scanner.nextInt();
        mar = scanner.nextInt();
        apr = scanner.nextInt();

        total = jan + feb + mar + apr;

        if (total >= TAX_LIMIT) {
            tax = total * HIGH_RATE / 100;
        } else {
            tax = total * LOW_RATE / 100;
        }
    }
}
