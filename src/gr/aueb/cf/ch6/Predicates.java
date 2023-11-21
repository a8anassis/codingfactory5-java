package gr.aueb.cf.ch6;

/**
 * Predicates = Boolean functions.
 */
public class Predicates {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 11};
        System.out.println("Arr all evens: " + allAreEvens(arr));
    }


    public static boolean allAreEvens(int[] arr) {
        if (arr == null) return false;
        boolean isEven = true;
        for (int num : arr) {
            if (num % 2 != 0) {
                isEven = false;
                break;
            }
        }
        return isEven;
    }


    public static boolean anyIsEven(int[] arr) {
        if (arr == null) return false;
        boolean isEven = false;
        for (int num : arr) {
            if (num % 2 == 0) {
                isEven = true;
                break;
            }
        }
        return isEven;
    }
}
