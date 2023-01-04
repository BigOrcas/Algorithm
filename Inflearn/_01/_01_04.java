import java.util.*;


class Main {
    public ArrayList<String> solution(int n,String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            // StringBuilder객체로 변환 후 문자열을 뒤집고, 다시 스트링객체로 변환한다
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] str = new String[n];
        for(int i=0; i<n;i++){
            str[i] = sc.next();
        }
        for(String x : main.solution(n,str)){
            System.out.println(x);
        }
    }
}