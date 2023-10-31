package gr.aueb.cf.ch4;

/**
 * Eternal for.
 */
public class ForEverApp {

    public static void main(String[] args) {
        int counter = 0;

        for (;;) {
            counter++;
            System.out.print("CF\u2661Forever");
            if (counter % 20 == 0) System.out.println();
            if (counter == 100) break;
        }
    }
}
