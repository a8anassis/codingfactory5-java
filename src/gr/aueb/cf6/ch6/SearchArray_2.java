package gr.aueb.cf6.ch6;

/**
 * Searches an array with a search-value.
 */
public class SearchArray_2 {

    public static void main(String[] args) {
        int[] grades = {8, 9, 2, 6, 10};
        int value = 10;
        int position;

        position = getPosition(grades, value);
        System.out.printf("Position: %d, Value: %d", position + 1, grades[position]);
    }

    /**
     * Searches the array to find a specific value. If the
     * value us found, the position in the array is returned.
     * The time complexity is linear, O(n).
     *
     * @param arr       the input array.
     * @param value     the value to search for.
     * @return          the position if the value is found,
     *                  -1 otherwise.
     */
    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
