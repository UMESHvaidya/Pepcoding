package Getting_Started;
import java.util.*;
public class GcdLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int ans = gcd(num1, num2);
        System.out.println(ans);
        System.out.println((num1*num2)/ans);
    }
    public static int gcd(int a, int b){
        if (b == 0)
            return a;
        else
            return gcd(b, a%b);
    }
}
