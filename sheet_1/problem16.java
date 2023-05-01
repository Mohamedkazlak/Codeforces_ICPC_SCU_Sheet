package problem_16;

import java.util.Scanner;

public class problem16 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int X = in.nextInt();

        int res = X / 1000;

        if(res%2 == 0){
            System.out.println("EVEN");
        }else {
            System.out.println("ODD");
        }
    }
}
