package gr.aueb.cf.ch8;

public class StringsWithoutTryCatchApp {

    public static void main(String[] args) {
        String[] tokens = {"LightBlue", "Yellow", "Red"};
        String s;
        String str = "Blue";

        s = getStringOrNull(tokens, str);
        System.out.printf("%s", (s == null) ? "Substring not found" : s);
    }

    /**
     *
     * @param strArray
     * @param str
     * @return
     */
    public static String getStringOrNull(String[] strArray, String str) {
        String strToReturn = null;

        if (strArray == null || str == null) return null;

        for (String s : strArray) {
            if (s.contains(str)) {
                strToReturn = s;
            }
        }
        return strToReturn;
    }
}
