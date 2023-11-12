package gr.aueb.cf.ch5;

public class EvenOrOddApp {

    public static void main(String[] args) {

    }

    /**
     * Evaluates a number if is even.
     *
     * @param a     the input number.
     * @return      true, if is even, false otherwise.
     */
    public static boolean isEven(int a) {
        return  (a % 2) == 0;
    }

    /**
     * Evaluates a number if is odd.
     *
     * @param a     the input number.
     * @return      true, if is odd, false otherwise.
     */
    public static boolean isOdd(int a) {
        return !isEven(a);
    }
}
