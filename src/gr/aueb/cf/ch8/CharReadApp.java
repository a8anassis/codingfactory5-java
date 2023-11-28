package gr.aueb.cf.ch8;

import java.io.IOException;
import java.util.Arrays;

/**
 * Reads two chars from standard input
 * and prints to console.
 */
public class CharReadApp {

public static void main(String[] args)  {
        String s;

        try {
            System.out.println("Please insert two chars");
            s = getString();
            System.out.println(s);
        } catch (IOException e) {
            System.out.println("Error in read");
        }
    }

    public static String getString() throws IOException {
        char[] tokens = new char[2];

        try {
            for (int i = 0; i <= tokens.length; i++) {
                tokens[i] = (char) System.in.read();
            }
        } catch (IOException e) {
            // recover
            e.printStackTrace();    // log
            throw e;                // rethrow
        }
        return Arrays.toString(tokens);
    }
}
