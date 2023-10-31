package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demo of switch/case fall through.
 */
public class SwitchFallThroughApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please insert grade");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("Pass");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Error. Grade between 1-10");
                break;
        }
    }
}
