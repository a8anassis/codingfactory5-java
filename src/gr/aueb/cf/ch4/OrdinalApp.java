package gr.aueb.cf.ch4;

/**
 * Αντιστοίχιση char - ordinal numbers
 */
public class OrdinalApp {

    public static void main(String[] args) {
        char beta = 'B';
        char bang = '!';

        System.out.printf("char: %c, ordinal: %d\n", beta, (int) beta);
        System.out.printf("char: %c, ordinal: %d", bang, (int) bang);
    }
}
