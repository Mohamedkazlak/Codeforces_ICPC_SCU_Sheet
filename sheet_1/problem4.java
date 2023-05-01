package problem_4;

import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A, B, C, D, X;
        A= in.nextInt(); B= in.nextInt(); C= in.nextInt(); D= in.nextInt();

        X=(A*B)-(C*D);
        System.out.print("Difference = "+X);

    }
}