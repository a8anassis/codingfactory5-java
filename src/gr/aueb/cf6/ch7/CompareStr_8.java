package gr.aueb.cf6.ch7;

public class CompareStr_8 {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "ATHENS";

        if (s1.compareTo(s2) < 0) {
            System.out.println("s1 < s2");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("s1 > s2");
        } else {
            System.out.println("s1 == s2");
        }

    }
}
