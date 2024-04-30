package gr.aueb.cf6.ch7;

import java.util.Scanner;

public class ReadString_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Insert two strings");
        s1 = in.next();     // consumes until \n \t whitespaces
        s2 = in.nextLine(); // consumes until \n , does not return \n

        System.out.println("Next1: " + s1);
        System.out.println("Next2: " + s2);
    }
}
