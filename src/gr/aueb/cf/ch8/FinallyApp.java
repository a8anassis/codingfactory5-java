package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Finally is always executed!
 */
public class FinallyApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        try {
            System.out.println("Please insert an int");
            num = in.nextInt();

            System.out.println(num);
            //in.close();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            //System.out.println("Error: invalid input token");
            // return;
        } finally {
            try {
                if (in != null) in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("It's not always executed");
    }
}
