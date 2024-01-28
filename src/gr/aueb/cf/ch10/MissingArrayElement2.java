package gr.aueb.cf.ch10;

/**
 * An array A consisting of N different integers is given.
 * The array contains integers in the range [1..(N + 1)], which means
 * that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 *
 * the function should return 4, as it is the missing element.
 *
 * Write an efficient algorithm.
 */
public class MissingArrayElement2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getMissingElement(arr));
    }

    public static int getMissingElement(int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n;

        n = arr.length + 1;
        expectedSum = n * (n + 1) / 2;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
