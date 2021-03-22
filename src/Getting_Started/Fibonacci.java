package Getting_Started;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first = 0, second = 1;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i < num; ++i){
            System.out.println(first + second);
            int temp = second;
            second += first;
            first = temp;
        }
    }
}
