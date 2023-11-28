package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result;

        System.out.println("Please insert two ints");
        numerator = in.nextInt();
        denominator = in.nextInt();

        result = numerator / denominator;

        System.out.println("Result: " + result);
    }
}
