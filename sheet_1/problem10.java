package problem_10;

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int A, B;

        A= in.nextInt(); B = in.nextInt();

        if( A % B == 0 || B % A == 0 ){
            System.out.println("Multiples");
        }else {
            System.out.println("No Multiples");
        }
    }
}
