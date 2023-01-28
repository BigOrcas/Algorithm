import java.util.*;
import java.io.*;

class Main {
    public ArrayList<Integer> solution(int n,int m ,int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<m-1;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int lt =0;
        for(int rt=m-1;rt<n;rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            result.add(map.size());
            map.put(arr[lt],map.get(arr[lt]-1));
            if(map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
        }
        return result;
    }


    public static void main(String args[]) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int x : main.solution(n,m,arr)) System.out.print(x+" ");
    }

}