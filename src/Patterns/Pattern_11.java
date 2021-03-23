package Patterns;

import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // System.out.println("here");
        int ans = 1;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j <= i; ++j){
                System.out.print(ans +"	");
                ans += 1;
            }
            System.out.println();
        }
    }
}
