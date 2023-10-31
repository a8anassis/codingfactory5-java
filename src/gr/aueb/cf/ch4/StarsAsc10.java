package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 1 star στη 1η γραμμή, 2 stars στη 2η γραμμή,
 * 3 stars στη 3η γραμμή, κ.ο.κ.
 */
public class StarsAsc10 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
