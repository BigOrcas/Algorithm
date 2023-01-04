import java.util.*;

class Main {
    public String solution(String str) {
        String answer = "";
        for(int i =0; i<str.length();i++){
            // indexOf는 해당문자의 가장 앞 index를 갖는다.
            //ksetkset이면 4번째 k는 str.indexOf(k) == 1 인데 4이므로 일치하지않는다
            if(str.indexOf(str.charAt(i)) ==i) answer+=str.charAt(i);

        }
        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }


}