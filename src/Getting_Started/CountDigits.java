package Getting_Started;
import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long number = scn.nextLong();
        int digits = 0;
        while(number != 0){
            number /= 10;
            digits ++;
        }
        System.out.println(digits);
    }
}
