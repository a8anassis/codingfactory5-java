package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * Print Stream Demo with method.
 */
public class PrintStreamMethod {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/f1.txt", "Windows-1252");
             PrintStream ps2 = new PrintStream("C:/tmp/f2.txt", StandardCharsets.UTF_8);
             PrintWriter pw = new PrintWriter("C:/tmp/f3.txt")) {
            //ps.println("Hello Coding Factory");
            printMsg(ps, "Γειά σου κόσμε!!!");
            printMsg(ps2, "Hello PrintStream 2!!!");
            printMsg(System.out, "Hello to Std Output!!!");
            pw.println("Hello from Print Writer");
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("File not found");
        }
    }

    /**
     *
     * @param ps
     * @param message
     */
    public static void printMsg(PrintStream ps, String message) {
       ps.println(message);
    }
}
