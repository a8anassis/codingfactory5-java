package gr.aueb.cf.ch10;

public class Grid15App {

    public static void main(String[] args) {
        int[][] grid = new int[2][2];
        int[][] grid2 = {
                          {1, 2},
                          {3, 4},
                          {5, 6}
        };

        int[][] jagged = new int[3][];

        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[5];

        grid[0][0] = 0;
        grid[0][1] = 1;
        grid[1][0] = 2;
        grid[1][1] = 3;

        printArray2D(grid);
        printArray2DIndex(grid2);
    }

    public static void printArray2DIndex(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void printArray2D(int[][] grid) {
        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    public static int arraySum(int[][] grid) {
        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
        }

        return sum;
    }
}
