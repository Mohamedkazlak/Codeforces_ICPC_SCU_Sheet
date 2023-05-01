package problem_22;

import java.util.Scanner;

public class problem22 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int A= in.nextInt(); char S=in.next().charAt(0); int B= in.nextInt();

        switch (S){
            case '<':
                if (A < B){
                    System.out.println("Right");
                }else {
                    System.out.println("Wrong");
                }
                break;

            case '>':
                if (A > B){
                    System.out.println("Right");
                }else {
                    System.out.println("Wrong");
                }
                break;

            case '=':
                if (A == B){
                    System.out.println("Right");
                }else {
                    System.out.println("Wrong");
                }
                break;
        }
    }
}
