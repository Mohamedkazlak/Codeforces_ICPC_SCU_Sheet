package problem_13;

import java.util.Scanner;

public class problem13 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        char c = in.next().charAt(0);
        if(c>='0'&&c<='9'){
            System.out.println("IS DIGIT");
        }
        else if(c>='a'&&c<='z'){

            System.out.println("ALPHA\n"+"IS SMALL");
        }
        else{
            System.out.println("ALPHA\n"+"IS CAPITAL");
        }
    }
}
