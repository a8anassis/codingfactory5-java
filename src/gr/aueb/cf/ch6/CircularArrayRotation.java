package gr.aueb.cf.ch6;

public class CircularArrayRotation {

    public static void main(String[] args) {

    }


    public static int[] shiftRightBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] shiftLeftBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }






}
