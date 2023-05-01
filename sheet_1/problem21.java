package problem_21;

import java.util.Scanner;

public class problem21 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double double_N = in.nextDouble();

        int int_N = (int) double_N;

        double result = double_N - int_N;
        if (result != 0)
            System.out.println("float " + int_N + " " + result);
        else
            System.out.println("int " + int_N);
    }
}
