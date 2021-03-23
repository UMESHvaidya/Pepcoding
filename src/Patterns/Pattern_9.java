package Patterns;

import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        for(int i = 0; i < number; ++i){
            for (int j = 0;j < number ; ++j ){
                if(i + j == number - 1 || i == j)
                    System.out.print("*	");
                else
                    System.out.print("	");

            }
            System.out.println();
        }
    }
}
