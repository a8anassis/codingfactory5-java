package gr.aueb.cf.ch14;

/**
 * Singleton Design Pattern.
 */
public class CodingFactory {
    private static final CodingFactory INSTANCE = new CodingFactory();

    private CodingFactory() {
    }

    public static CodingFactory getInstance() {
        return INSTANCE;
    }

    public void sayHi(String message) {
        System.out.println("Hi Only One Coding Factory!");
    }
}
