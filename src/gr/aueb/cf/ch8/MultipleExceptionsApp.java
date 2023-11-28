package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("C:/tmp/random.txt");

        try (Scanner in = new Scanner(file)) {
            int ch = System.in.read();
            int num = in.nextInt();
        } catch (FileNotFoundException | InputMismatchException e1) {
            e1.printStackTrace();
            //System.err.println("Error. File not found");
            System.out.println(e1.getMessage());
        } catch (IOException e2) {
            e2.printStackTrace();
            System.err.println("Error. IO error");
        }
//        catch (InputMismatchException e3) {
//            e3.printStackTrace();
//            System.err.println("Error. Invalid token error");
//        }
        catch (Exception e3) {
            e3.printStackTrace();
            System.err.println("Error. Generic Exception error");
        }
    }
}
