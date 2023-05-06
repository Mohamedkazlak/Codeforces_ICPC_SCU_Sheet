package problem_2;

import java.util.Scanner;

public class problem_b {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int X = in.nextInt();

        if(X == 1){
            System.out.println(-1);
        }

        for ( int i = 1 ; i <= X ; i++){

            if(i % 2 == 0 ){
                System.out.println(i);
            }
        }
    }
}
