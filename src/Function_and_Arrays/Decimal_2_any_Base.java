package Function_and_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Decimal_2_any_Base {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();
        System.out.println(getValueInBase(num, base));
    }
    public static String getValueInBase(int num, int base){
        ArrayList<Integer> lst = new ArrayList<Integer>();
        int count = 0;
        String ans = "";
        while (num != 0){
            lst.add(num%base);
            num /= base;
        }
        for(int i = lst.size() - 1; i >= 0; --i)
            ans += lst.get(i);
        return ans;
    }
}
