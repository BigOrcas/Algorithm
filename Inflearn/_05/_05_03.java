import java.util.*;
import java.io.*;

class Main {
    public int solution(int[][] board,int[] move){
        int result =0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : move){
            for(int i=0;i<board.length;i++){
                if(board[i][pos-1]!=0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1]=0;
                    if(!stack.isEmpty() &&tmp==stack.peek()){
                        result+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] board = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int [] move = new int[m];
        for(int i=0;i<m;i++){
            move[i]=sc.nextInt();
        }
        System.out.println(main.solution(board,move));

    }

}