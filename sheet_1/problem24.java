package problem_24;

import java.util.Scanner;

public class problem24 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        long a, b;
        long c, d;

        a = in.nextLong(); b = in.nextLong(); c = in.nextLong(); d = in.nextLong();

        if (c >= a && b <= d && c <= b && d >= a)
        {
            System.out.println(c + " " + b);
        }
        else if (c <= a && d <= b && c <= b && d >= a)
        {
            System.out.println(a + " " + d);
        }
        else if (c >= a && d <= b && c <= b && d >= a)
        {
            System.out.println(c + " " + d);
        }
        else if (c <= a && b <= d && c <= b && d >= a)
        {
            System.out.println(a + " " + b);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
