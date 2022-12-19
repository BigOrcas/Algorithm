import java.util.*;


class Main {
    public int solution(String str){

        int answer ;

        str = str.toUpperCase().replaceAll("[^0-9]","");
        answer = Integer.parseInt(str);


        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(main.solution(str));

    }
}