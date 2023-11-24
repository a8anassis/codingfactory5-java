package gr.aueb.cf.ch7;

public class HelloString {

    public static void main(String[] args) {
        String alice = "Alice";
        String bob = "Bob";

        System.out.println(alice + " " + bob);
        System.out.printf("%s %s", alice, bob);
        System.out.println("Total length of alice string: " + alice.length());
        System.out.println("Total Bob length: " + bob.length());
    }
}
