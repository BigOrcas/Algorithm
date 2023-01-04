import java.util.*;


class Main {
    public String solution(String input){

        String answer = "";

        int rt = input.length()-1;
        int lt = 0;

        char[] sc  = input.toCharArray();

        while(lt<rt){
            // 알파벳이 아닐때
            if(!Character.isAlphabetic(sc[lt])){
                lt ++;
            }else if(!Character.isAlphabetic(sc[rt])){
                rt --;
            }else{
                char tmp = sc[lt];
                sc[lt] = sc[rt];
                sc[rt] = tmp;
                lt ++;
                rt --;
            }
        }
        answer=String.valueOf(sc);
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(main.solution(input));

    }
}