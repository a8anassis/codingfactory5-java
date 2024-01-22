package gr.aueb.cf.ch20.regex;

public class RegExApp {

    public static void main(String[] args) {
        String s = "c.f@aueb.gr";
        System.out.println(isEmail(s));
    }

    public static boolean isRed(String s) {
        return s.matches("Red");
    }

    public static boolean isRedOrGreen(String s) {
        return s.matches("Red|Green");
    }

    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean startsWithUppercaseEndWithIng(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean startsWithUpperOrLowercaseEndWithIng(String s) {
        return s.matches("[a-zA-Z][iI][nN][gG]");
    }

    public static boolean isAnySymbolFollowedBySpaceAndDigit(String s) {
        return s.matches(".\\s\\d");
    }

    public static boolean isLetterFollowedByDigit(String s) {
        return s.matches("^\\w\\d$");
        //return s.matches("[0-9a-zA-Z_][0-9]");
    }

    public static boolean isLetterDigitAnywhere(String s) {
        return s.matches(".*\\w\\d.*");
    }

    public static boolean isEmail(String s) {
        return s.matches("^[a-zA-Z.%+-_]+@\\w+\\.[a-zA-Z]{2,}$");
    }








}
