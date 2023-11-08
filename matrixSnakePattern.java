import java.util.ArrayList;
import java.util.Scanner;

public class matrixSnakePattern {
    public static ArrayList<Integer> printSnakePattern(int[][] matrix, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n) {
            while (j < n) {
                ans.add(matrix[i][j]);
                j++;
            }
            i++;
            j--;
            if (i < n) {
                while (j >= 0) {
                    ans.add(matrix[i][j]);
                    j--;
                }
            } else {
                break;
            }
            i++;
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        ArrayList<Integer> list = printSnakePattern(matrix, n);
        System.out.println(list);
        s.close();
    }
}
