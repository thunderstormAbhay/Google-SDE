package Medium;
import java.util.Scanner;

public class Maze_path {

    public static int paths(int row, int col, int endx, int endy) {
        if (row > endx || col > endy) return 0;
        if (row == endx && col == endy) return 1;
        int rightways = paths(row, col + 1, endx, endy);
        int downways = paths(row + 1, col, endx, endy);
        return rightways + downways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and then Enter n:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(paths(0, 0, m - 1, n - 1)); 
         // Adjusted for 0-indexed grid
         sc.close();
    }
}
