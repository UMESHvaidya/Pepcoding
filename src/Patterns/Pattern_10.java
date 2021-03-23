package Patterns;

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = n/2, stars = 1;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < spaces; ++j){
                System.out.print("	");
            }
            for(int k = 0; k < stars; ++k){
                if (k == 0 || k == stars - 1)
                    System.out.print("*	");
                else
                    System.out.print("	");
            }
            if (i < n/2){
                spaces --;
                stars += 2;
            }
            else{
                spaces ++;
                stars -= 2;
            }
            System.out.println();
        }
    }
}
