package gr.aueb.cf6.ch6;

public class TwoDim_14 {

    public static void main(String[] args) {
        int[][] arr = new int[2][3];    // 2 rows , 4 columns
        arr[0][2] = 5;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        int[][] arr2 = {{1, 2}, {3, 4}, {5, 6}};
        for (int[] row : arr2) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


        int[][] arr3;
        arr3 = new int[][] {{1, 2}, {3, 4}, {5, 6}, {7, 8}};    // array initializer


        int[][] arr4 = new int[3][];
        arr4[0] = new int[10];
        arr4[1] = new int[15];
        arr4[2] = new int[25];
        for (int[] row : arr4) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
