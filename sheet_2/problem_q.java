package problem_17;

import java.util.Scanner;

public class problem_q {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt(), num2 = in.nextInt();
//        while ();
        {
            long sum = 0;
            int min = 0, max = 0;
            if (num1 <= 0 || num2 <= 0)
            {
                return;
            }
            if (num1 >= num2)
            {
                max = num1;
                min = num2;
            }
            else
            {
                max = num2;
                min = num1;
            }
            for (int i = min; i <= max; i++)
            {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.print("sum =" + sum);
        }

    }
}
