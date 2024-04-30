package gr.aueb.cf6.ch6;

import java.util.Arrays;

public class ShallowDeepCopy_15 {

    public static void main(String[] args) {
        int[][] grid = new int[][] {{1, 2, 3}, {4, 5, 6}};

        /*int[][] gridRef = copyReference(grid);
        gridRef[0][0] = 10;

        System.out.println("GRID");
        traverse(grid);
        System.out.println("GRID-REF");
        traverse(gridRef);*/

//        int[][] gridShallow = shallowCopy(grid);
//        gridShallow[0][0] = 10;
//        System.out.println("GRID");
//        traverse(grid);
//        System.out.println("GRID-SHALLOW");
//        traverse(gridShallow);

        int[][] gridDeep = deepCopy(grid);
        gridDeep[0][0] = 10;
        System.out.println("GRID");
        traverse(grid);
        System.out.println("GRID-DEEP");
        traverse(gridDeep);


    }

    public static int[][] copyReference(int[][] arr) {
        return arr;
    }

    public static int[][] shallowCopy(int[][] arr) {
        return Arrays.copyOf(arr, arr.length);
    }
//
    public static int[][] deepCopy(int[][] arr) {
        int[][] arrayToReturn = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            arrayToReturn[i] = new int[arr[i].length];
//            for (int j = 0; j < arr[i].length; j++) {
//                arrayToReturn[i][j] = arr[i][j];
//            }
            arrayToReturn[i] = Arrays.copyOf(arr[i], arr[i].length);
        }
        return arrayToReturn;
    }

    public static void traverse(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
