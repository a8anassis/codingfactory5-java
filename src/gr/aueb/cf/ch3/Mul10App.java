package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το 1 * 2 * 3 * ... * 10
 */
public class Mul10App {
    public static void main(String[] args) {
        int i = 1;
        int result = 1;

        while (i <= 10) {
            result *= i;
            i++;
        }

        System.out.println("Result: " + result);
        System.out.printf("Result: %,d ", result);
    }
}
