package problem_8;

import java.util.Scanner;

public class problem_h {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for non-prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
