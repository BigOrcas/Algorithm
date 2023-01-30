import java.util.*;

public class Main {

    public void solution(String str) {

        String result = "";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            }else if(x == ')'){
                stack.pop();
            }

            if(stack.isEmpty() && x != ')') {
                result += x;
            }

        }

        System.out.println(result);

    }

    public static void main(String args[]) {
        Main main = new Main();

        Scanner in= new Scanner(System.in);

        String str = in.nextLine();

        main.solution(str);
    }

}