import java.util.*;
import java.io.*;

class Main {
    public char solution(int n,String s){
        char result=' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x :s.toCharArray()){
            //getOrDefault 새로운 key값이라면 0으로 넣어준다
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
//            System.out.println(key+" "+map.get(key));
            // map.get(key) KEY의 VALUE값
            if(map.get(key)>max){
                max=map.get(key);
                result=key;
            }
        }
        return result;
    }


    public static void main(String args[]) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String str = sc.next();
        System.out.println(main.solution(n,str));
    }

}