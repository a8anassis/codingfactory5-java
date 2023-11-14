package gr.aueb.cf.ch6;

/**
 * Demonstrates two-dimensional arrays.
 */
public class TwoDimArray {

    public static void main(String[] args) {
        int[][] grid = new int[3][4];
        int[][] arr = {  {1, 2},
                         {3, 4},
                         {5, 6}
        };

        int[][] arr2 = new int[][] {{5, 6, 7}, {8, 9, 10}, {11, 12, 13}};

        // Jagged Arrays
        int[][] jagged = new int[3][];
        jagged[0] = new int[4];
        jagged[1] = new int[10];
        jagged[2] = new int[20];

        grid[0][0] = 5;
        grid[2][3] = 10;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
        }

        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + " ");
            }
        }

        for (int[] row : jagged) {
            for (int num : row) {
                System.out.print(num + " ");
            }
        }

    }
}
