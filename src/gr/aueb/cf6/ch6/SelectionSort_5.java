package gr.aueb.cf6.ch6;

public class SelectionSort_5 {

    public static void main(String[] args) {
        int[] arr = {7, 8, 12, 21, 5, 7, 9, 10};
        selectionSort(arr);
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        if (arr == null) return;
        int minPosition;
        int min;

        for (int i = 0; i < arr.length - 1; i++) {
            minPosition = i;
            min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }

            swap(arr, i, minPosition);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
