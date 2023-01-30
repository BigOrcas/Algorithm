import java.util.*;

public class Main {

    public String solution(String str) {

        String result = "YES";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            }else {
                // 닫는 괄호가 많을경우 이곳에서 걸림 ')'
                if(stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        // 여는 괄호가 많을경우 이곳에서 걸림 '('
        if(!stack.isEmpty()) {
            result = "NO";
        }

        return result;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner in= new Scanner(System.in);

        String str = in.nextLine();

        System.out.print(main.solution(str));
    }

}