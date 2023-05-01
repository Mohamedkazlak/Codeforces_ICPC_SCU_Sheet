package problem_6;

import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n,m,last_digit_n,last_digit_m,sum;
        n= in.nextLong(); m=in.nextLong();

        last_digit_n= n%10;
        last_digit_m= m%10;

        sum= last_digit_n + last_digit_m;
        System.out.print(sum);


    }
}