package problem_23;

import java.util.Scanner;

public class problem23 {

    public static void validate(int result, int myResult){
        if (myResult == result) {
            System.out.println("Yes");
        } else {
            System.out.println(myResult);
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num1, num2, result;
        char opr, equalChr;
        int finalResult = 0;

         num1 = in.nextInt(); opr = in.next().charAt(0); num2 = in.nextInt(); equalChr = in.next().charAt(0); result = in.nextInt();

        switch (opr)
        {
            case '+':
                finalResult = num1 + num2;
                break;
            case '-':
                finalResult = num1 - num2;
                break;
            case '*':
                finalResult = num1 * num2;
                break;
        }
        validate(result, finalResult);
    }
}
