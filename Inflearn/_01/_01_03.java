import java.util.*;

class Main{
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE; //정수의 최소값 출력

        String [] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if(m<len){
                m=len;
                answer=x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print(m.solution(str));

    }
}