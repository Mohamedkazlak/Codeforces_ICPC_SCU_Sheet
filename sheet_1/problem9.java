package problem_9;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A, B;

        A = in.nextInt(); B = in.nextInt();

        if (A >= B){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
