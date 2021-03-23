package Patterns;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0, next = 1;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j <= i; ++j){
                System.out.print(first +"	");
                int temp = first;
                first = next;
                next = first + temp;
            }
            System.out.println();
        }
    }
}
