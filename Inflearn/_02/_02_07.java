import java.util.*;
class Main{

    public void solution(int n,int[] arr){
        int answer =0, cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                cnt++;
                answer+=cnt;
            }
            else cnt =0;
        }
        System.out.println(answer);
    }

    public static void main(String[] args){

        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        main.solution(n,arr);

    }


}