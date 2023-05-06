package problem_4;

import java.util.Scanner;

public class problem_d {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int password;

        while (true){
            password = in.nextInt();

            if(password == 1999){
                System.out.println("Correct");
                break;
            }else {
                System.out.println("Wrong");
            }
        }
    }
}
