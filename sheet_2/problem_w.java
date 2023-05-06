package problem_23;

import java.util.Scanner;

public class problem_w {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num, times = in.nextInt();

        for (int i = 1; i <= times; i++) {

            num = in.nextInt();

            int ones = 0;
            int plus = 0;
            int dec = 0;

            while (num != 0) {

                if (num % 2 == 1) {

                    ones++;
                    dec += 1 * Math.pow(2, plus);
                    plus++;
                }
                num /= 2;

            }

            System.out.println(dec);
        }
    }
}