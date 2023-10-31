package gr.aueb.cf.ch4;

/**
 * Υπολογίζει το άθροισμα και το γινόμενο
 * 1 έως 10.
 */
public class ForMulSumApp {

    public static void main(String[] args) {

        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;
        }

        System.out.printf("Sum: %d, Mul: %,d", sum, mul);
    }
}
