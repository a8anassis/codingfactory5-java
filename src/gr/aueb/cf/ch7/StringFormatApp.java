package gr.aueb.cf.ch7;

/**
 * Demo of String format
 */
public class StringFormatApp {

    public static void main(String[] args) {
        char row = 'G';
        int column = 8;

        String seat = String.format("%c%02d", row, column);
        System.out.println(seat);
    }
}
