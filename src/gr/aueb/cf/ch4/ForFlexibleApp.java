package gr.aueb.cf.ch4;

import java.util.Scanner;

public class ForFlexibleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iterations = 0;

        System.out.println("Please insert start value, end value, step");
        startValue = scanner.nextInt();
        endValue = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startValue; i <= endValue; i = i + step) {
            iterations++;
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Iterations: " + iterations);
    }
}
