package gr.aueb.cf.ch14;

/**
 * Utility Class.
 * -private constructor
 * -no state
 * -public static methods
 */
public class HelloUtil {

    /**
     * No instances of this class should be available.
     */
    private HelloUtil() {

    }

    public static void sayHello() {
        System.out.println("Hello CF!");
    }
}
