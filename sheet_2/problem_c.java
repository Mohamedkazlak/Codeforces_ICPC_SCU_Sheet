package problem_3;

import java.util.Scanner;

public class problem_c {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int counter = in.nextInt();

        int even = 0, odd = 0, positive = 0, negative = 0;

        for(int i = 1; i <= counter; i++){

            int num;

            num = in.nextInt();

            if(num % 2 == 0){
                even++;
            }else{
                odd++;
            }

            if (num > 0){
                positive++;
            }else if(num < 0){
                negative++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
    }
}
