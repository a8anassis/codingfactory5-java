package gr.aueb.cf6.ch6;

/**
 * Swap Demo.
 */
public class Swap_4 {

    public static void main(String[] args) {
        int[] arr = {1, 2};

        System.out.printf("a=%d, b=%d\n", arr[0], arr[1]);
        swap(arr);
        System.out.printf("a=%d, b=%d", arr[0], arr[1]);
    }

    /**
     * Swaps the elements of an array.
     * @param arr
     */
    public static void swap(int[] arr) {
        if (arr == null || arr.length != 2) {
            return;
        }

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}
