import java.util.Scanner;

public class week10q1hw {

    public static void busiestRow(int[][] grid) {
        int maxTotal = -1;
        int maxRow = 0;

        for (int i = 0; i < grid.length; i++) {
            int total = 0;

            for (int j = 0; j < grid[i].length; j++) {
                total += grid[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                maxRow = i;
            }
        }

        System.out.println("Row " + maxRow + ", Total " + maxTotal);
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 0, 1},
            {3, 3, 1},
            {1, 1, 1}
        };

        busiestRow(grid);
    }
}