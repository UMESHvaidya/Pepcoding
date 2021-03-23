package Patterns;

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int spaces = number/2;
        int stars = 1;
        for(int i = 0; i < number; ++i){
            for(int j = 0; j < spaces; ++j)
                System.out.print("	");
            for(int j = 0 ; j < stars; ++j)
                System.out.print("*	");
            if (i < number/2){
                spaces -= 1;
                stars += 2;
            }else{
                spaces += 1;
                stars -= 2;
            }
            System.out.println();
        }
    }
}
