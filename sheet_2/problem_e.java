package problem_5;

import java.util.Scanner;

public class problem_e {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int counter = in.nextInt();
        int max = 0;

        for (int i = 1; i <= counter; i++) {

            int num = in.nextInt();

            if(i == 1){
                max = num;
            }

            if(num > max){
                max = num;
            }
        }

        System.out.println(max);
    }
}


