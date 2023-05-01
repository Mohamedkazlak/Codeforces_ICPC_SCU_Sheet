package problem_26;

import java.util.Scanner;

public class problem26 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double a, b, c, d;

        a = in.nextDouble(); b = in.nextDouble(); c = in.nextDouble(); d = in.nextDouble();

        double res1 = b * Math.log(a);
        double res2 = d * Math.log(c);
        if (res1 > res2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
