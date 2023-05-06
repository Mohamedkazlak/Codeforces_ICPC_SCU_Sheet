package problem_26;

import java.util.Scanner;

public class problem_z {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int max = in.nextInt(), sum = in.nextInt(), counter = 0;

        for (int i = 0; i <= max; i++)
        {
            for (int z = 0; z <= max; z++)
            {
                if (sum - i - z >= 0 && sum - i - z <= max)
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
