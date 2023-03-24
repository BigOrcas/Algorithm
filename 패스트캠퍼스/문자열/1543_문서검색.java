import java.util.Scanner;


class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc .nextLine();

        int count =0;
        int start_idx =0;
        while(true){
            int idx = doc.indexOf(word,start_idx);
            if(idx<0) break;
            count++;
            start_idx = idx +word.length();

        }
        System.out.println(count);

    }


}