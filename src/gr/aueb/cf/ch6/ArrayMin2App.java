package gr.aueb.cf.ch6;

/**
 * Finds the min value of an array
 * by using max value;
 */
public class ArrayMin2App {

    public static void main(String[] args) {
        int[] arr = {10, 5, 19, 3, 90};
        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;
        int maxValue = Integer.MIN_VALUE;
        int maxPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        System.out.printf("Min value: %d, Min position: %d", minValue, minPosition + 1);
        System.out.printf("Max value: %d, Max position: %d", maxValue, maxPosition + 1);
    }
}
