package gr.aueb.cf.ch6;

/**
 * Sorts an array with
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {6, 9, 4, 2, 12};

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) swap(arr, j, j+1);
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
