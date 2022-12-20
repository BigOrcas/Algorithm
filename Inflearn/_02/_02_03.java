import java.util.*;


class Main {
    public void solution(int n,int[] a,int[] b) {
        for(int i=0;i<n;i++){

            if(b[i]-a[i]==1 ||a[i]-b[i]>1 ){
                System.out.println("B");
            }else if(a[i]==b[i]){
                System.out.println("D");
            }else{
                System.out.println("A");
            }
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];

        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            b[i] = sc.nextInt();
        }
        main.solution(n,a,b);


    }
}