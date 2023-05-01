package problem_5;

import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       double r, π = 3.141592653, Area;
       r= in.nextDouble();
        Area= π*(r*r);
        System.out.println(String.format("%.9f", Area));

    }
}