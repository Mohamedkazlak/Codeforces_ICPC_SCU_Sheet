package problem_18;

import java.util.Scanner;

public class problem_r {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int counter = in.nextInt();

//        while (counter--)
        {
            int num1 = in.nextInt(), num2 = in.nextInt(), sum = 0;
            int min, max;
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
            for (int i = min + 1; i <= max - 1; i++)
            {
                if (i % 2 != 0)
                {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
