package problem_25;

import java.util.Scanner;

public class problem25 {

    public static void solution(){
        Scanner in = new Scanner(System.in);

        long  a, b;
        long  c, d;

        a = in.nextLong(); b = in.nextLong(); c = in.nextLong(); d = in.nextLong();

        long  equation = a % 100 * b % 100 * c % 100 * d % 100;
        if (equation <= 9)
        {
            System.out.println("0" + equation);
        }
        else
        {
            System.out.println(equation);
        }

    }
    public static void main(String[] args){

        solution();
    }
}
