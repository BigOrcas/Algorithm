import java.util.*;
class Main{

    public void solution(int n,String[] arr){
        for(String x: arr){
            String str = new StringBuilder(x).reverse().toString();
            int result = Integer.parseInt(str);
            boolean isPrime = true;
            if(result !=1){
                for(int i=2;i<=result;i++){
                    if(result%i==0){
                        isPrime =false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(result + " ");
                }
            }
        }

    }

    public static void main(String[] args){

        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        main.solution(n,arr);



    }


}