package gr.aueb.cf6.ch6;

/**
 * Finds the min position and value
 * of an array.
 */
public class MinArray_3 {

    public static void main(String[] args) {

    }

    /**
     * Returns the array min element based on
     * integer max value. Time complexity is linear.
     * O(n).
     *
     * @param arr
     * @return
     */
    public static int getMinPosition(int[] arr) {
        if (arr == null) return -1;
        if (arr.length == 0) return -1;

        int min = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }

    /**
     * Returns the min element based on
     * min first element.
     * @param arr
     * @return
     */
    public static int getMinPosition2(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int minPosition = 0;
        int min = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                minPosition = i;
                min = arr[i];
            }
        }
        return minPosition;
    }
}
