import java.util.*;


class Main {
    public void solution(int n,int[] arr) {

        int cnt = 0;
        int max =0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max =arr[i];
                cnt++;
            }
        }
        System.out.print(cnt);

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n+1];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        main.solution(n,arr);
    }
}