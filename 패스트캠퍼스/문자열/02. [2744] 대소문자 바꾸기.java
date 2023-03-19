import java.util.Scanner;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ans = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= ans[i] && ans[i] <= 'z')
                ans[i] = (char)('A' + ans[i] - 'a');
            else ans[i] = (char)('a' + ans[i] - 'A');
        }
        System.out.println(ans);
    }
}
//    소문자 'a'의 아스키 코드 값은 97, 대문자 'A'의 아스키 코드 값은 65입니다
//    예를 들어, 현재 처리하고 있는 문자가 'd'인 경우,
//    a'에서 'd'를 뺀 값은 3입니다. 이 값을 'A'에 더한 결과는 68이므로,
//    'd'를 대문자 'D'로 변환하려면 ans[i] = (char)('A' + ans[i] - 'a')
//    와 같은 코드를 사용하면 됩니다.
//
//    반대로, 현재 처리하고 있는 문자가 대문자인 경우, 소문자로 변환합니다.
//    대문자 'A'의 아스키 코드 값은 65이고, 소문자 'a'의 아스키 코드 값은 97입니다.
//    따라서, ans[i]에서 'A'를 빼고 'a'를 더한 값을 char 타입으로 캐스팅하면 됩니다.
