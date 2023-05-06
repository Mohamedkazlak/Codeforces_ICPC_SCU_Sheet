package problem_20;

import java.util.Scanner;

public class problem_t {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number, range1, range2;
        number = in.nextInt(); range1 = in.nextInt(); range2 = in.nextInt();
        long sum = 0;
        for (int i = 1; i <= number; i++)
        {
            if (i / 10 == 0)
            {
                if (i >= range1 && i <= range2)
                {
                    sum += i;
                }
            }
            else
            {
                int myNumber = i;
                int mySum = 0;

//                while (myNumber)
                {
                    int digit = myNumber % 10;
                    mySum += digit;
                    myNumber /= 10;
                }
                if (mySum >= range1 && mySum <= range2)
                {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
        }
    }

