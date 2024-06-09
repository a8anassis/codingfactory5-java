package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) throws FileNotFoundException {
        int num = 0;
        File fd = new File("C:\\tmp\\hello.txt");

        try (Scanner in = new Scanner(fd)) {
            if (in.hasNextInt()) {
                num = in.nextInt();
                System.out.println(num);
            } else {
                System.out.println("Error in input");
                in.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}


