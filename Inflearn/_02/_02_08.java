import java.util.*;
class Main{

    public void solution(int n,int[] arr){
        int [] answer = new int[n];
        for(int i=0;i<n;i++){
            int cnt=1;
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]) cnt++;
            }
            answer[i]=cnt;
            System.out.print(answer[i]+" ");
        }
    }


    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n  = sc .nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        main.solution(n,arr);

    }


}