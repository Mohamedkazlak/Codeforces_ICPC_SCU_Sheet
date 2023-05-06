package problem_13;

import java.util.Scanner;

public class problem_m {

    static boolean luck(int i)
    {
        boolean lucky = false;
        while (i != 0)
        {
            int digit = i % 10;
            if (digit == 4 || digit == 7)
            {
                lucky = true;
            }
            else
            {
                lucky = false;
                break;
            }
            int new_i = (i - digit) / 10;
            if (new_i == 0)
            {
                break;
            }
            i = new_i;
        }
        return lucky;
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();

        boolean isLuck = false;
        for (int i = a; i <= b; i++)
        {

            if (luck(i))
            {
                System.out.print(i + " ");
                isLuck = true;
            }
        }
        if (!isLuck)
        {
            System.out.println(-1);        }

    }
}
