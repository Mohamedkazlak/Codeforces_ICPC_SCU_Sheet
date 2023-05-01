package problem_14;

import java.util.Scanner;

public class problem14 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

            char X = in.next().charAt(0);

        if(X >= 'a' && X <= 'z'){
            System.out.println(Character.toUpperCase(X));
        }else {
            System.out.println(Character.toLowerCase(X));
        }
    }
}
