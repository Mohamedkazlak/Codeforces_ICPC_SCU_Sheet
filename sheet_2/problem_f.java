package problem_6;

import java.util.Scanner;

public class problem_f {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        for (int i = 1; i <= 12; i++){

            System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}
