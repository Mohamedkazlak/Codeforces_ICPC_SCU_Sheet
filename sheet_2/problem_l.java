package problem_12;

import java.util.Scanner;

public class problem_l {

     static int GCD(int a, int b){

        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int a = in.nextInt(); int b = in.nextInt();

        System.out.println(GCD(a, b));
    }
}
