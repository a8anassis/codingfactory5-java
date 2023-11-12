package gr.aueb.cf.ch5;

/**
 * Μεταθέτει αμοιβαία τις τιμές δύο
 * μεταβλητών.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.printf("a = %d, b = %d", a, b);
    }

    /**
     * Swaps two values.
     *
     * @param a     the first value.
     * @param b     the second value.
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
