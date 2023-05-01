package problem_15;

import java.util.Scanner;

public class problem15 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int A, B;
        char S;
         A = in.nextInt();S = in.next().charAt(0);B = in.nextInt();

        switch (S){
            case '+':
                System.out.print(A+B);
                   break;
            case '-':
                System.out.print(A-B);
                      break;
            case '*':
                System.out.print(A*B);
                    break;
            case '/':
                System.out.println(A/B);
                    break;
                }
    }
}
