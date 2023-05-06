package problem_7;

import java.util.Scanner;

public class problem_g {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int t = input.nextInt();
        while(t-- > 0){
            int num = input.nextInt();
            long fact = 1;
            for (int i = 1; i <= num; i++)
                fact *= i;
            System.out.println(fact);
        }
        input.close();

    }
}

