package Getting_Started;

import java.util.Scanner;

public class Rotate_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String number = scn.next();
        int k = scn.nextInt();
        String ans = "";
        if (k > 0){
            k = k % number.length();
            for(int i = number.length()-(k); i <= number.length() - 1;++i)
                ans += number.charAt(i);
            for(int i = 0; i <= number.length()-(k) -1;++i)
                ans += number.charAt(i);
            System.out.println(ans);
        }
        if (k < 0){
            k = Math.abs(k); String news = "";
            k = k % number.length();
            for(int i = 0; i <= k - 1;++i)
                ans += number.charAt(i);
            for(int i = k; i <= number.length()-1;++i)
                news += number.charAt(i);
            System.out.println(news + ans);
        }
    }
}
