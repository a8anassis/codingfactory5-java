package gr.aueb.cf.ch7;

/**
 * Searches for chars or substrings.
 */
public class StringSearchApp {

    public static void main(String[] args) {
        String s = "Athens Uni of Eco Uni and Bus";

        if (s.contains("Uni")) {
            System.out.println("Bingo");
        }

        char ch = 'a';
        int index = s.indexOf(ch);
        System.out.println(index);

        if (s.startsWith("Athens")) {
            System.out.println("Starts with Athens");
        }

        String athens = s.substring(6);
        System.out.println(athens);
    }
}
