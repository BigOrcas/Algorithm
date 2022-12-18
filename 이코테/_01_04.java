import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int result =0;

        while(true){
            // N이 K로 나누어 떨어지는 수가 될때까지만 1씩 빼기
            int target = (n/m)*m;
            result +=(n-target);
            n= target;

            if(n<m) break;
            result +=1;
            n /= m;
        }

        result +=(n-1);
        System.out.println(result);

    }

}