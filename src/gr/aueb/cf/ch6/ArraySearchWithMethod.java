package gr.aueb.cf.ch6;

/**
 * Searches for a specific element value
 * in an array using a method.
 */
public class ArraySearchWithMethod {

    public static void main(String[] args) {

    }

    /**
     * Returns the position of the element if found,
     * -1 otherwise.
     *
     * @param arr       the input array.
     * @param value     the element value to find.
     * @return          the position of the element in the
     *                  array, -1 otherwise.
     */
    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }

    /**
     * Updates the value of an array element.
     *
     * @param arr       the input array.
     * @param oldValue  the value to be replaced.
     * @param newValue  the value to replace.
     * @return          true, if updated, false otherwise.
     */
    public static boolean updateElement(int[] arr, int oldValue, int newValue) {
        if (arr == null) return false;
        int positionToUpdate = -1;

        positionToUpdate = getPosition(arr, oldValue);
        if (positionToUpdate == -1) return false;

        arr[positionToUpdate] = newValue;
        return true;
    }

    /**
     * Removes an element from an array and returns
     * a new array without the deleted element.
     *
     * @param arr       the input array.
     * @param value     the value to delete.
     * @return          a destination array without
     *                  the removed element.
     */
    public static int[] removeElement(int[] arr, int value) {
        if (arr == null) return null;
        int positionToDelete = -1;

        positionToDelete = getPosition(arr, value);
        if (positionToDelete == -1) return null;

        int pivot = 0;
        int[] arrayToReturn = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (i != positionToDelete) {
                arrayToReturn[pivot] = arr[i];
                pivot++;
            }
        }
        return arrayToReturn;
    }
}


