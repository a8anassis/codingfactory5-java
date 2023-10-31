package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Switch/case demo.
 */
public class SwitchApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following: ");
            System.out.println("1. One-player game");
            System.out.println("2. Two-player game");
            System.out.println("3. team game");
            System.out.println("4. Quit");
            System.out.println("Please insert your choice: ");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("One-player game");
                    break;
                case 2:
                    System.out.println("Two-player game");
                    break;
                case 3:
                    System.out.println("Team game");
                    break;
                case 4:
                    System.out.println("Quit ...");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (choice != 4);
    }
}
