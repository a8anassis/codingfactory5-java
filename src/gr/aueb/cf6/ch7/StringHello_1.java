package gr.aueb.cf6.ch7;

public class StringHello_1 {

    public static void main(String[] args) {
        String s1 = "Hello Coding Factory";     // String literal
        String s2 = "Hello Coding Factory";
        String s3 = new String("Hello Coding Factory");

        s2 = "Hello Again!";

        System.out.println(s1);
        System.out.printf("s2: %s\n", s2);
        System.out.printf("s3: %s\n", s3);
    }
}
