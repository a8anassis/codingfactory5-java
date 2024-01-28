package gr.aueb.cf.ch10;

/**
 *A non-empty array A consisting of N integers is given. The array contains an odd number
 * of elements, and each element of the array can be paired with another element that has
 * the same value, except for one element that is left unpaired.
 *
 * For example, in array A such that:
 *
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 *
 * the elements at indexes 0 and 2 have value 9,
 * the elements at indexes 1 and 3 have value 3,
 * the elements at indexes 4 and 6 have value 9,
 * the element at index 5 has value 7 and is unpaired.
 *
 * For example, given array A such that:
 *
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 *
 * the function should return 7, as explained in the example above.
 *
 * Write an efficient algorithm O(n))
 *
 */
public class NotPaired2 {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1};
        int result = 0;

        for (int num : arr) {
            // Το XOR ακυρώνει τα ζεύγη όμοιων αριθμών
            result ^= num;
        }
        System.out.println("Result: " + result);
    }
}
