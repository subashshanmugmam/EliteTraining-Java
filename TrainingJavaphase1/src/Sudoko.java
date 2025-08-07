import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sudoko {
    public static void main(String []args) {
        System.out.println("Enter the sudoku grid : ");
        Scanner s = new Scanner(System.in);
        Random r=new Random(0);
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = r.nextInt(10);
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println(isValidSudoku(arr));
    }
    public static boolean isValidSudoku(int[][] grid) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[10];
            for (int j = 0; j < 9; j++) {
                int num = grid[i][j];
                if (num < 1 || num > 9 || seen[num]) return false;
                seen[num] = true;
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[10];
            for (int i = 0; i < 9; i++) {
                int num = grid[i][j];
                if (num < 1 || num > 9 || seen[num]) return false;
                seen[num] = true;
            }
        }

        // Check 3x3 subgrids
        for (int block = 0; block < 9; block++) {
            boolean[] seen = new boolean[10];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = 3 * (block / 3) + i;
                    int col = 3 * (block % 3) + j;
                    int num = grid[row][col];
                    if (num < 1 || num > 9 || seen[num]) return false;
                    seen[num] = true;
                }
            }
        }
        return true;
    }
}
