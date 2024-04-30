package gr.aueb.cf6.ch7;

import java.util.Scanner;

public class ParseInt_10 {

    public static void main(String[] args) {
        String s;
        int num;
        Scanner in = new Scanner(System.in);

        System.out.println("Insert an int");
        s = in.nextLine();
        num = Integer.parseInt(s);  // NumberFormatException

        System.out.println(num);
    }
}
