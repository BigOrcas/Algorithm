import java.util.*;

class Main {

    public int solution(int n) {
        // 소수의 개수
        int answer = 0;

        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                //i의 배수만큼 반복한다
                for (int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(main.solution(n));
    }
}