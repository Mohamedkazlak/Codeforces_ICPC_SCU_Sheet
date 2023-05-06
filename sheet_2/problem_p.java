package problem_16;

import java.util.Scanner;

public class problem_p {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i, count = 0;
        int n = in.nextInt();

        for(int j = 1; j <= n; j++){

            int a = in.nextInt();

            while (a > 0) {

                i = a % 10;

                System.out.print(i + " ");

                a = a / 10;

            }
            System.out.println();
        }
    }
}