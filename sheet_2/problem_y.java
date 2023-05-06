package problem_25;

import java.util.Scanner;

public class problem_y {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int times = in.nextInt(), first = 0, second = 0, sum;

        for (int i = 0; i < times; i++)
        {

            if (i <= 1)
            {
                first = 0;
                second = 1;
                System.out.print(i + " ");
            }
            else
            {
                sum = first + second;

                System.out.print(sum + " ");

                first = second;
                second = sum;
            }
        }
    }
}
