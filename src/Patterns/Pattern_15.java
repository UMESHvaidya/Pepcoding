package Patterns;

import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = n/2, nums= 1, val = 0;
        for(int i = 0;i < n; ++i){
            for(int j = 0; j < spaces; ++j)
                System.out.print("	");
            for (int k = 0; k < nums ; ++k ){
                if (k <= (int) nums/2){
                    val += 1;
                    System.out.print(val +"	");
                }
                else{
                    val -= 1;
                    System.out.print(val+"	");
                }
                if(k == nums-1 && i >= (int)n/ 2){
                    val -= 2;
                }
            }
            if(i < n/2){
                spaces --;
                nums += 2;
            } else{
                spaces ++;
                nums -= 2;
            }
            System.out.println();
        }
    }
}
