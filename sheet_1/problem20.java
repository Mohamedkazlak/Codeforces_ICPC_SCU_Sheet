package problem_20;

import java.util.Scanner;

public class problem20 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int A = in.nextInt(); int B = in.nextInt(); int C = in.nextInt();

        int max, min , mid;
        if (A >= B && A >= C)
        {
            max = A;
            if (B >= C)
            {
                mid = B;
                min = C;
            }
            else
            {
                mid = C;
                min = B;
            }
        }
        else if (B >= A && B >= C)
        {
            max = B;
            if (A >= C)
            {
                mid = A;
                min = C;
            }
            else
            {
                mid = C;
                min = A;
            }
        }
        else
        {
            max = C;
            if (A >= B)
            {
                mid = A;
                min = B;
            }
            else
            {
                mid = B;
                min = A;
            }
        }
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);

        System.out.println();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
