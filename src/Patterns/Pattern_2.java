package Patterns;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        for (int i = number -1 ;i >=0 ;--i){
            for (int j = i; j >= 0 ; --j )
                System.out.print("*	");
            System.out.println();
        }
    }
}
