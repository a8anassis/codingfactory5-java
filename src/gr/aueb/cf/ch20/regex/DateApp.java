package gr.aueb.cf.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateApp {

    public static void main(String[] args) {
        String date = "12/09/2016";

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(date);

        if (matcher.matches()) {
            String wholeDate = matcher.group(0);
            String day = matcher.group(1);
            String month = matcher.group(2);
            String year = matcher.group(3);

            String enDate = month + "/" + day + "/" + year;
            System.out.println("Whole Date: " + wholeDate);
            System.out.println("English Date Format: " + enDate);
        } else {
            System.out.println("No matches found");
        }
    }
}
