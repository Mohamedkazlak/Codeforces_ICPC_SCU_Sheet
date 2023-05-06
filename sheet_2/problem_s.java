package problem_19;

import java.util.Scanner;

public class problem_s {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();

        for (int i = 1; i <= lines; i++) {

            for (int w = lines - i; w >= 1; w--) {
                System.out.print(" ");
            }

            // use i*2 in for loop
            for (int x = 1; x <= (i * 2) - 1; x++) {
                System.out.print("*");
            }

            System.out.println();
        }
}
}
