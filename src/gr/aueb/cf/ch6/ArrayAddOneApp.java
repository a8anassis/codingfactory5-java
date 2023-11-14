package gr.aueb.cf.ch6;

public class ArrayAddOneApp {

    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9};
        int[] result = addOne(arr);

        for (int num : result) {
            System.out.print(num);
        }
    }

    public static int[] addOne(int[] arr) {
        if (arr == null) return null;
        int carry = 1;
        int sum;
        int[] arrOut = new int[arr.length + 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }

        arrOut[0] = carry;
        return arrOut;
    }


    public static int[] addTwoInts(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) return null;
        if (arr1.length != arr2.length) return null;

        int carry = 0;
        int sum;
        int[] arrOut = new int[arr1.length + 1];

        for (int i = arr1.length - 1; i >= 0; i--) {
            sum = arr1[i] + arr2[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }

        arrOut[0] = carry;
        return arrOut;
    }
}
