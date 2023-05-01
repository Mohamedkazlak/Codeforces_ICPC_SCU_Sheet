package problem_8;

import java.util.Scanner;
import java.lang.Math;

public class problem8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        long  A , B;

        A = in.nextLong(); B = in.nextLong();

        System.out.println("floor " + A +" / "+ B +" = " + Math.floorDiv(A, B));
        System.out.println("ceil " + A +" / "+ B +" = " + (int)Math.ceil((float) A /B));
        System.out.print("round " + A +" / "+ B +" = " + Math.round((float) A/B));

    }
}