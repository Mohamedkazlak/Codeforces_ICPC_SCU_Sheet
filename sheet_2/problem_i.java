package problem_9;

import java.util.Scanner;

public class problem_i {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num = in.nextInt(), reversedNum = 0, remainder;


        int originalNum = num;


        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum);
            System.out.println("YES");
        }
        else {
            System.out.println(reversedNum);
            System.out.println("NO");
        }
    }
}
