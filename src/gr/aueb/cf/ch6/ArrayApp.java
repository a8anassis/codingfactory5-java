package gr.aueb.cf.ch6;

/**
 * Array Demo.
 */
public class ArrayApp {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr[2] = " + arr[2]);

        System.out.printf("arr[0] = %d\n", arr[0]);
        System.out.printf("arr[1] = %d\n", arr[1]);
        System.out.printf("arr[2] = %d\n", arr[2]);
    }
}
