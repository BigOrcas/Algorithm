import java.util.*;

class Main {

    public void solution(int n, int[] arr) {
        //결과
        int result = 0;
        //가산점
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                count++;
                result += count;
            } else {
                count = 0;
            }
        }
        System.out.print(result);
    }
    public static void main(String args[]) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        m.solution(n, arr);
    }
}