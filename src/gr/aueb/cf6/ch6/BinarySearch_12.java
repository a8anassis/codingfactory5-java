package gr.aueb.cf6.ch6;

public class BinarySearch_12 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 9, 12, 45, 67, 89};
        int low = 0;
        int high = arr.length - 1;
        int position = 0;

        position = binarySearch(arr, 67, low, high);

        if (position == -1) {
            System.out.println("Element not found");
            System.exit(1);
        }

        System.out.println("Element found in position: " + (position + 1));

    }

    public static int binarySearch(int[] arr, int value, int low, int high) {
        int mid = 0;
        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;


        mid = (low + high) / 2;
        if (value == arr[mid]) return mid;

        if (value < arr[mid]) {
            return binarySearch(arr, value, low, mid - 1);
        }  else {
            return binarySearch(arr, value, mid + 1, high);
        }
    }
}
