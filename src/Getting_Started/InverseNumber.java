package Getting_Started;

import java.util.*;
import java.lang.*;
public class InverseNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String number = scn.next();
        int []arr = new int[number.length()];
        for (int i = number.length() - 1; i >=0 ; --i)
            arr[(int)(number.charAt(i) - (int)'0'- 1)] = number.length() - i;
        for(int i = arr.length -1; i >= 0; --i)
            System.out.print(arr[i]);
        System.out.println();

    }
}
