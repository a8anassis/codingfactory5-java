package gr.aueb.cf.ch7;

/**
 * Demo of Split method.
 */
public class SplitApp {

    public static void main(String[] args) {
        String aueb = "Athens::::::::Un:::Of:Econ::::and:Bus";

        String[] tokens = aueb.split(":");

        for (String token : tokens) {
            System.out.print(token);
        }
    }
}
