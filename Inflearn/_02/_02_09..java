import java.util.*;
import java.io.*;

public class Main {

    public int solution(int n, int[][] arr) {
        int result = Integer.MIN_VALUE;
        int row, col;
        for (int i = 0; i < n; i++) {
            row = col = 0;
            for (int j = 0; j < n; j++) {
                //행 열 덧셈
                row += arr[i][j];
                col += arr[j][i];
            }
            //두 인자값은 큰것을 return
            result = Math.max(result, row);
            result = Math.max(result, col);
        }
        row = col = 0;
        for (int i = 0; i < n; i++) {
            //대각선 덧셈
            row += arr[i][i];
            col += arr[i][n - i - 1];
        }
        result = Math.max(result, row);
        result = Math.max(result, col);
        return result;
    }

    public static void main(String args[]) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(m.solution(n, arr));
    }
}