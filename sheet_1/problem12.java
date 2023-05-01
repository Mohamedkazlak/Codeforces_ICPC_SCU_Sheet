package problem_12;

import java.util.Scanner;

public class problem12 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

            String F1 = in.next(); String S1 = in.next();
            String F2 = in.next(); String S2 = in.next();

            if(S1.equals(S2)){
                System.out.println("ARE Brothers");
            }else {
                System.out.println("NOT");
            }
    }
}
