package gr.aueb.cf.ch6;

public class BitwiseApp {

    public static void main(String[] args) {

    }

    /**
     * Simulates the XOR operator by using
     * only AND, OR, NOT logical operators.
     *
     * @param b1    the first boolean value.
     * @param b2    the second boolean value.
     * @return      the XOR result.
     */
    public static boolean XOR(boolean b1, boolean b2) {
        return (b1 && !b2) || (!b1 && b2);
    }

    /**
     * Returns the reverse digit (0 / 1) for
     * every digit of the source array. Essentially,
     * it returns the One's Compliment.
     *
     * @param binaryVector  the source array.
     * @return  the Compliment by one of the source array.
     */
    public static int[] complimentByOne(int[] binaryVector) {
        int[] binaryOut;
        if (binaryVector == null) return null;

        binaryOut = new int[binaryVector.length];
        for (int i = 0; i < binaryVector.length; i++) {
            binaryOut[i] = (binaryVector[i] == 0) ? 1 : 0;
        }
        return binaryOut;
    }
}
