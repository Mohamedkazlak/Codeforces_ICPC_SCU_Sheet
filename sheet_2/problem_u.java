package problem_21;

import java.util.Scanner;

public class problem_u {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int lines = in.nextInt();
            int counter = 1;
            for (int i = 1; i <= lines; i++)
            {
                if (counter % 4 == 0)
                {
                    counter++;
                    System.out.println("PUM");;
                    i--;
                    continue;
                }
                System.out.print(counter + " ");
                counter++;
                System.out.print(counter + " ");
                counter++;
                System.out.print(counter + " ");
                counter++;
            }
        System.out.println("PUM");;
    }
}