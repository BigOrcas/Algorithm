import java.util.*;

public class Main {

    public void solution(String str, String str1) {

        // 결과
        String result = "YES";

        Queue <Character> qu = new LinkedList<>();

        for(char x : str.toCharArray()) {
            qu.offer(x);
        }

        for(char x : str1.toCharArray()) {
            if(qu.contains(x)) {
                if(qu.poll() != x){
                    result = "NO";
                }
            }
        }

        if(qu.isEmpty()) {
            result = "YES";
        }else {
            result = "NO";
        }


        System.out.println(result);

    }

    public static void main(String args[]) {
        Main main = new Main();

        Scanner in= new Scanner(System.in);

        String str = in.nextLine();
        String str1 = in.nextLine();

        main.solution(str, str1);
    }

}