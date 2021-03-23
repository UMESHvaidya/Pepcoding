package Patterns;

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        for (int i = 0; i < number ; ++i ){
            for (int j = number-1; j > i ; --j)
                System.out.print("	");
            for(int k = 0; k <= i; k++)
                System.out.print("*	");
            System.out.println();
        }
    }
}
