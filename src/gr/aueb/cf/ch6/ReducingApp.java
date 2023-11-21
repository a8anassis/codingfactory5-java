package gr.aueb.cf.ch6;

/**
 * Reducing Demo.
 */
public class ReducingApp {

    public static void main(String[] args) {

    }

    /**
     * Returns the sum od all the elements
     * of the array.
     *
     * @param arr   the source array.
     * @return      the aggregate total.
     */
    public static int getTotal(int[] arr) {
        if (arr == null) return 0;
        int total = 0;
        for (int item : arr) {
            total += item;
        }
        return total;
    }

    /**
     * Returns the average of the elements of
     * the array.
     * @param arr   the source array.
     * @return      the average.
     */
    public static double getAvg(int[] arr) {
        if (arr == null || arr.length == 0) return 0.0;
        // if (arr.length == 0) return 0.0;

        return  getTotal(arr) / (double) arr.length;
    }
}
