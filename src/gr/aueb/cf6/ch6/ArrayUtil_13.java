package gr.aueb.cf6.ch6;

import java.util.Arrays;

public class ArrayUtil_13 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 4, 5};

        // Sort
        Arrays.sort(arr);
        traverse(arr);

        System.out.println();
        // binary search to sorted array
        int positionOf1 = Arrays.binarySearch(arr, 1);
        System.out.println("POSITION OF 1: " + positionOf1);

        int[] arrayCopy = Arrays.copyOf(arr, arr.length); // 0 to length exclusive
        traverse(arrayCopy);

        System.out.println();
        int[] arrayRangeCopy = Arrays.copyOfRange(arr, 1, arr.length); // 1 to length exclusive
        traverse(arrayRangeCopy);
    }

    public static void traverse(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
