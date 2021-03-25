package Function_and_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AnyBase2AnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base_1 = scn.nextInt();
        int base_2 = scn.nextInt();
        int d = getValueIndecimal(number, base_1);
        int ans = getValueInBase(d, base_2);
        System.out.println(ans);
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
    public static int getValueInBase(int number, int base_2){
        ArrayList<Integer> lst = new ArrayList<Integer>();
        int count = 0;
        String ans = "";
        while (number != 0){
            lst.add(number%base_2);
            number /= base_2;
        }
        for(int i = lst.size() - 1; i >= 0; --i)
            ans += lst.get(i);
        return Integer.parseInt(ans);
    }
}
