package gr.aueb.cf6.ch6;

public class MappingApp_7 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] mappedArr = mapDouble(arr);
        printArr(mappedArr);
    }

    public static int[] mapDouble(int[] arr) {
        int[] returnedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            returnedArr[i] = arr[i] * 2;
        }
        return returnedArr;
    }

    public static void printArr(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
