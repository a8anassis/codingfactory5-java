package gr.aueb.cf6.ch7;

public class SplitApp_11 {

    public static void main(String[] args) {
        String s = "Athens Uni of Econ and Bus";
        String[] tokens = getTokens(s);
        for (String token : tokens) {
            System.out.print(token + " ");
        }
    }

    public static String[] getTokens(String s) {
        String[] tokens = s.split(" +");
        return tokens;
    }
}
