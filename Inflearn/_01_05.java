import java.util.*;

class Main {
    public String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        //lt 첫문자 rt 끝문자
        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {

            //문자가 알파벳인지 구분
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                //알파벳이라면 교환하는 tmp
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        //s를 string화 시켜주는 valueOf
        answer = String.valueOf(s);


        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));


    }


}