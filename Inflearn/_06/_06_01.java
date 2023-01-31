import java.util.*;

public class Main {

    public void solution(int n, int[] array) {

        int first = 0;
        int tmp = 0;
        int count = 0;
        for(int i=0; i<n; i++) {
            // 맨 앞의 자리 배열을 저장
            first = array[i];
            tmp = array[i];
            count = i;
            for(int j=i; j<n; j++) {
                if(tmp > array[j]) {
                    tmp = array[j];
                    count = j;
                }
            }

            array[count] = first;
            array[i] = tmp;

            System.out.print(array[i] + " ");
        }

    }

    public static void main(String args[]) {
        Main main = new Main();

        Scanner in= new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = in.nextInt();
        }

        main.solution(n, array);
    }

}