package Patterns;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int spaces = number/2;
        int stars = 1;
        for(int i = 0; i < number; ++i){
            for(int j = number -1; j > i; --j)
                System.out.print("	");
            System.out.print("*");
            System.out.println();
        }
    }
}
