import java.util.*;

class Main {

    public void solution(int n, int[][] arr) {
        int result = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }

                }
            }
            if (max < cnt) {
                max = cnt;
                result = i;
            }

        }
        System.out.println(result + 1);
    }

    public static void main(String args[]) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        m.solution(n, arr);
    }
}