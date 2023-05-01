package problem_7;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        long n, sum=0;

        n = in.nextLong();

        sum = n*(1+n)/2;

        System.out.println(sum);
    }
}
