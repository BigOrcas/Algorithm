import java.util.*;


class Main {
    public void solution(int n) {
        int result = 0;
        int [] arr = new int[n];
        arr[0]=1;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+result;
            result = arr[i-1];
        }
        for(int i =0;i<n;i++){
            System.out.printf(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        main.solution(n);


    }
}