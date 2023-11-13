package gr.aueb.cf.ch6;

/**
 * Demonstrates 'update' of array
 * elements.
 */
public class ReplaceArrayElements {

    public static void main(String[] args) {
        int[] grades = {7, 8, 6, 9, 4, 5};
        increaseByOne(grades);

        for (int grade : grades) {
            System.out.print(grade + " ");
        }
    }

    /**
     * Traverses and updates each array
     * element increasing by one.
     *
     * @param arr   the source array.
     */
    public static void increaseByOne(int[] arr) {
        if (arr == null) return;

        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
//            arr[i] = arr[i] + 1;
//            arr[i] += 1;
        }
    }
}
