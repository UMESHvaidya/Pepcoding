package Function_and_Arrays;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long num = scn.nextLong();
        int digit = scn.nextInt();
        System.out.println(fun(num, digit));
    }
    public static int fun(long num, int digit){
        int ans = 0;
        while(num != 0){
            long part = num % 10;
            if(part == digit)
                ans += 1;
            num /= 10;
        }
        return ans;
    }
}
