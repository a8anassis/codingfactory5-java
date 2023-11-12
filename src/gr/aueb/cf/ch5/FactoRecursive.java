package gr.aueb.cf.ch5;

public class FactoRecursive {

    public static void main(String[] args) {

    }

    /**
     * Returns n!.
     *
     * @param n     the input number.
     * @return      the factorial of n.
     */
    public static int facto(int n) {
       /* if (n <= 1) {
            return 1;
        }

        return n * facto(n-1);*/

        return (n <= 1) ? 1 : n * facto(n-1);
    }
}
