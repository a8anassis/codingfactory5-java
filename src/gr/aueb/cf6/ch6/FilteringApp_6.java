package gr.aueb.cf6.ch6;

/**
 * Filters even
 */
public class FilteringApp_6 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] returnedArr;

        returnedArr = filterEven(arr);
        printArr(returnedArr);

    }

    public static int[] filterEven(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }

        int[] returnedArr = new int[count];
        count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                returnedArr[count] = item;
                count++;
            }
        }
        return returnedArr;
    }

    public static void printArr(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
