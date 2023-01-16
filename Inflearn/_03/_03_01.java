import java.util.*;


class Main {

    public ArrayList<Integer> solution(int n, int[] a, int m, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) result.add(a[p1++]); //전위증감연산자
            else result.add(b[p2++]);
        }
        //n,m배열이 남았다면 남은 것들을 계산해주는 while문
        while (p1 < n) result.add(a[p1++]);
        while (p2 < m) result.add(b[p2++]);

        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int x : main.solution(n, a, m, b)) System.out.println(x + " ");
    }
}