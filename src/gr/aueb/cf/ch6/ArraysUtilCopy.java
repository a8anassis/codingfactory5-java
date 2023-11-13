package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Demonstrates the Arrays utility class.
 */
public class ArraysUtilCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        printArray(arrCopy);
        System.out.println();

        int[] arrCopy2 = Arrays.copyOfRange(arr, 1, arr.length);
        printArray(arrCopy2);

    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }


}
