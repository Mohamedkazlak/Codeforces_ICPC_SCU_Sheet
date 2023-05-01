package problem_18;

import java.util.Scanner;

public class problem18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int age = in.nextInt();

        int year = age / 365;
        System.out.println(year + " years");

        age -= year * 365;
        int month = age / 30;
        System.out.println(month + " months");

        age -= month * 30;
        int day = age;
        System.out.println(day + " days");
    }
}