import java.util.*;
import java.io.*;

class Main {
    public String solution(String s1,String s2){
        String result = "YES";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x,map.get(x)-1);
        }

        return result;
    }


    public static void main(String args[]) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        String b = sc.next();
        System.out.print(main.solution(a,b));
    }

}