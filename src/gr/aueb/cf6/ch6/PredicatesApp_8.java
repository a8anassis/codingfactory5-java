package gr.aueb.cf6.ch6;

public class PredicatesApp_8 {

    public static void main(String[] args) {

    }

    public static boolean isOnePositive(int[] arr) {
        boolean isPositive = false;

        for (int item : arr) {
            if (item > 0) {
                isPositive = true;
                break;
            }
        }
        return isPositive;
    }

    public static boolean areAllPositive(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count == arr.length;
    }

    public static boolean areLTNPositive(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count <= threshold;
    }

    public static boolean areGTEven(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areGTOdd(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areSameEnding(int[] arr, int threshold) {
        int count = 0;
        int ending;
        int[] endings = new int[10];
        boolean sameEnding = false;

        for (int item : arr) {
            ending = item % 10;
            endings[ending]++;
        }
        for (int item : endings) {
            if (item >= threshold) {
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }

    public static boolean areSameGroupOfTen(int[] arr, int threshold) {
        int count = 0;
        int ten;
        int[] groupOfTen = new int[10];
        boolean sameTen = false;

        for (int item : arr) {
            ten = item / 10;
            groupOfTen[ten]++;
        }
        for (int item : groupOfTen) {
            if (item >= threshold) {
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }
}
