package Patterns;

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        for (int i = 0; i < number ; ++i){
            for (int j = 0;j < i ;++j) {
                System.out.print("	");
            }
            for(int k = 0; k < number - i; ++k)
                System.out.print("*	");
            System.out.println();
        }
    }
}
