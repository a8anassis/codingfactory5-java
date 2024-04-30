package gr.aueb.cf6.ch7;

public class StrFormatApp_12 {

    public static void main(String[] args) {
        char row = 'A';
        int column = 1;

        String seat = String.format("%c%02d", row, column);
        System.out.println("Seat: " + seat);
    }
}
