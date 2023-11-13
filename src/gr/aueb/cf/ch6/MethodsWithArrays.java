package gr.aueb.cf.ch6;

/**
 * Demo with arrays as input parameters
 * in methods.
 */
public class MethodsWithArrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printArray(arr);
        System.out.println();
        printArray(arr, 1, 3);
    }

    /**
     * Prints the elements of an array.
     *
     * @param arr   the source array.
     */
    public static void printArray(int[] arr) {
        if (arr == null) return;

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    /**
     * Overloaded version of printArray. Prints
     * the elements of an array in a region defined
     * from 'low' index to 'high' index.
     *
     * @param arr
     *              the source array.
     * @param low
     *              the 'from' index.
     * @param high
     *              the 'to' index.
     */
    public static void printArray(int[] arr, int low, int high) {
        if (arr == null) return;
        if (low < 0 || high > arr.length - 1) return;
        if (low > high) return;

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
