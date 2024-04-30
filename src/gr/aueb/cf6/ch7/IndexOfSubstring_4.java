package gr.aueb.cf6.ch7;

public class IndexOfSubstring_4 {

    public static void main(String[] args) {
        String s = "AUEB";
        int positionOfA = s.indexOf('A');
        int positionOfAU = s.indexOf("U");

        System.out.println("Position of A: " + positionOfA);
        System.out.println("Position of A: " + positionOfAU);

        String sub1 = s.substring(1);
        System.out.println(sub1);

        String sub2 = s.substring(1, 2);
        System.out.println(sub2);
     }
}
