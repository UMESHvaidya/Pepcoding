package Getting_Started;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPrimesToN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = num1; i <= num2; ++i){
            boolean flag = true;
            for(int j = 2; j <= (int)Math.sqrt(i); ++j){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                primes.add(i);
        }
        for (Integer prime : primes) System.out.println(prime);
    }
}
