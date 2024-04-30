package gr.aueb.cf6.ch7;

public class TraverseWithSubstring_5 {

    public static void main(String[] args) {
        String s = "Athens";
        traverse(s);
    }

    public static void traverse(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i+1));
        }
    }
}
