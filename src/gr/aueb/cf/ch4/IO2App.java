package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Reads a char using Scanner.
 */
public class IO2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar = ' ';

        System.out.println("Please insert a char");
        inputChar = scanner.nextLine().charAt(0);

        System.out.println("Input char: " + inputChar);
    }
}
