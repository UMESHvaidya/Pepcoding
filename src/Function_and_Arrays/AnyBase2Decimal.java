package Function_and_Arrays;

import java.util.Scanner;

public class AnyBase2Decimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
       int decimal= 0,counter = 0;
        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        for (int i = digits.length-1; i >= 0; i--) {
            decimal += (((int)digits[i] - 48)*(int)Math.pow(b,counter));
            counter ++;
        }
        return decimal;
    }
}
