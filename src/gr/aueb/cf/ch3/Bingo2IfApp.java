package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Bingo2IfApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET = 12;

        while (true) {
            System.out.println("Please insert a num");
            inputNum = scanner.nextInt();

            if (inputNum == SECRET) {
                System.out.println("Bingo!");
                break;
            }

            System.out.println("Not found. Try Again!");

        }
        System.out.println("Thanks for using Bingo Game");
    }
}
