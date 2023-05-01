package problem_11;

import java.util.Scanner;

public class problem11 {
    public static void main(String args[]) {

        // creating scanner to accept radius of circle
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int largest = largest(A, B, C);
        int smallest = smallest(A, B, C);

        System.out.print(smallest + " " + largest);

        scanner.close();
    }

    /**
     * Java method to calculate largest of three numbers
     *
     * @param A
     * @param B
     * @param C
     * @return maximum or largest of three
     */
    public static int largest(int A, int B, int C) {
        int max = A;
        if (B > max) {
            max = B;
        }

        if (C > max) {
            max = C;
        }

        return max;
    }

    /**
     * Java method to calculate smallest of three numbers
     *
     * @param A
     * @param B
     * @param C
     * @return minimum or smallest of three
     */
    public static int smallest(int A, int B, int C) {
        int min = A;
        if (B < min) {
            min = B;
        }

        if (C < min) {
            min = C;
        }

        return min;
    }
}


