package problem_10;

import java.util.Scanner;

public class problem_j {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int i,n,counter, j;

        n = in.nextInt();


        for(j = 2; j <= n; j++){

            counter = 0;

            for(i = 1; i <= j; i++){

                if(j % i == 0){

                    counter++;
                }
            }
            if(counter == 2)
                System.out.print(j+" ");
        }
    }
}

