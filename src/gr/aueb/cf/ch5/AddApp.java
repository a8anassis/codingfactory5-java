package gr.aueb.cf.ch5;

public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = AddApp.add(a, b);

        System.out.printf("%d + %d = %d", a, b, result);
    }

    /**
     * Returns the sum of two integers.
     *
     * @param a     the first integer.
     * @param b     the second integer.
     * @return      the sum of a, b.
     */
    public static int add(int a, int b) {
        return a + b;


       /* // Δήλωση και αρχικοποίηση
        int sum = 0;

        // Εντολές
        sum = a + b;

        // Επιστροφή αποτελέσματος
        return sum;*/
    }
}
