package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει ως είσοδο true/false από το stdin, για δύο δεξαμενές
 * καυσίμων ενός αεροπλάνου εάν τα καύσιμα είναι κάτω από 1/4.
 * Επεξεργάζεται και αν η μία δεξαμενή είναι < 1/4 ανάβει η πορτοκαλί
 * ένδειξη, αν και οι δύο είναι < 1/4 ανάβει η κόκκινη ένδειξη.
 */
public class TankApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert tank1 status (true / false)");
        isEmptyTank1 = scanner.nextBoolean();

        System.out.println("Please insert tank2 status (true / false)");
        isEmptyTank2 = scanner.nextBoolean();

        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.println("Orange: " + isOrange + ", Red: " + isRed);
    }
}
