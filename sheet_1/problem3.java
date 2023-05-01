package problem_3;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long x, y, summation, multiplication, subtraction;
        x = input.nextInt();
        y = input.nextInt();

        summation = x + y;
        multiplication = x * y;
        subtraction = x - y;

        System.out.println(x + " + " + y + " = " + summation);
        System.out.println(x + " * " + y + " = " + multiplication);
        System.out.println(x + " - " + y + " = " + subtraction);
    }
}
