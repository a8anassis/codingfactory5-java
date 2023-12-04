package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * FileStream with auto-flush.
 * FileOutputStream with true = append
 */
public class PrintStreamAutoFlushApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/f5.txt", true), true, StandardCharsets.UTF_8)) {
            ps.println("Hello Coding Factory");
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("File not found");
        }
    }

}
