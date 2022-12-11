import java.util.*;

class Main{
    public ArrayList<String> solution(String[] str,int n){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        for(String x : m.solution(str,n)){
            System.out.println(x);
        }
    }
}