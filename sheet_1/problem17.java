package problem_17;

import java.util.Scanner;

public class problem17 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        float X = in.nextFloat(); float Y = in.nextFloat();

        if (X == 0 && Y == 0) {
            System.out.println("Origem");
        }
        else if (X != 0 && Y == 0) {
            System.out.println("Eixo X");

        }else if (X == 0 && Y != 0){
            System.out.println("Eixo Y");

        }else if (X > 0 && Y > 0){
            System.out.println("Q1");

        }else if (X < 0 && Y > 0){
            System.out.println("Q2");

        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");

        }else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        }

        }
    }
