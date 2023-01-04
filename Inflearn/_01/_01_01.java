import java.util.*;

class Main{
    public int solution(String str,char t){
        int answer = 0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
        for(char x : str.toCharArray()) {
            if (x == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0); //charAt -> 스트링으로 저장된문자열중에서 한글자만 선택해서 char타입으로 변환
        System.out.print(m.solution(str,t));

    }
}
