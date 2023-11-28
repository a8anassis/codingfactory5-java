package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Integer.parseInt(string-arithmetic value)
 */
public class NumberFormatExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        System.out.println("Please insert an int");
        inputStr = in.nextLine();

        if (!isInt(inputStr)) {
            System.out.println("Error. Invalid token");
            System.exit(1);
        }

        num = Integer.parseInt(inputStr);
        System.out.println("Input num: " + inputStr);
    }

    /**
     * Returns true, if the parsing string evaluates
     * to integer.
     *
     * @param str   the input string.
     * @return      true, if the parsing string evaluates
     *              to integer, false otherwise.
     */
    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
