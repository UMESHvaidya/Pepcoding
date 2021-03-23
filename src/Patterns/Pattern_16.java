package Patterns;

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][2*n-1];
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < 2*n-1; ++j){
                if (j <= i)
                    arr[i][j] = j + 1;
                else if (j >= 2*n-1 - (i+1))
                    arr[i][j] = 2 * n - (j + 1);
            }
        }
        // for(int[] val:arr)
        //     System.out.println(Arrays.toString(val));
        for (int i = 0;i < n;++i){
            for (int j = 0;j < 2*n -1 ;++j){
                if (arr[i][j] != 0)
                    System.out.print(arr[i][j]+"	");
                else
                    System.out.print("	");
            }
            System.out.println();
        }
    }
}
