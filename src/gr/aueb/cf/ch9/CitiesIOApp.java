package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Διαβάζει από ένα αρχείο όπου κάθε γραμμή έχει τη μορφή:
 * Χώρα πόλη1 πόλη2 κλπ., και επιστρέφει τόσα αρχεία πόλεων
 * όσα και οι χώρες που περιλαμβάνονται στο αρχικό αρχείο.
 */
public class CitiesIOApp {

    public static void main(String[] args) {
        String line = "";
        String[] cities;
        File dir = new File("C:/tmp/io");
        File grFile = new File(dir + "/" + "gr.txt");
        File usaFile = new File(dir + "/" + "usa.txt");
        File deFile = new File(dir + "/" + "de.txt");

        if (!dir.exists()) {
            boolean success = dir.mkdir();
            if (!success) {
                System.err.println("Error in make dir");
                System.exit(1);
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/cities.txt"));
             PrintStream psGr = new PrintStream(grFile, StandardCharsets.UTF_8);
             PrintStream psUsa = new PrintStream(usaFile, StandardCharsets.UTF_8);
             PrintStream psDe = new PrintStream(deFile, StandardCharsets.UTF_8)) {

            while ((line = bf.readLine()) != null) {
                cities = line.split(" +");
                switch (cities[0]) {
                    case "Greece":
                        /*File grFile = new File(dir + "/" + "gr.txt");
                        PrintStream psGr = new PrintStream(grFile, StandardCharsets.UTF_8);*/
                        printTitle(psGr, "GR Cities");
                        printTokens(psGr, cities);
                        //psGr.close();
                        break;
                    case "USA":

                        printTitle(psUsa, "USA Cities");
                        printTokens(psUsa, cities);
                        break;
                    case "Germany":

                        printTitle(psDe, "Germany Cities");
                        printTokens(psDe, cities);
                        break;
                    default:
                        System.out.println("Error in Cities file");
                }
            }

    } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void printTokens(PrintStream ps, String[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            ps.print(tokens[i] + " ");
        }
    }

    public static void printTitle(PrintStream ps, String title) {
        ps.println(title);
    }
}
