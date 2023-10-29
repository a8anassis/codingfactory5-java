package gr.aueb.cf.ch2;

/**
 * Demonstrates arithmetic operators.
 */
public class ExprApp {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 20;
        int sum = 0;
        int result1 = 0;

        sum = num1 + num2;  // =32

        //result1 = sum++;      // result=32, sum=33
        //result1 = ++sum;        // result = 33, sum = 33

        // sum++;  // 33
        sum = sum + 1;

        sum--;
        sum = sum - 1;

        result1 = sum--;  // 32

        result1 = result1 + 10;
        result1 += 10;
        result1 -= 20;
        result1 *= 2;
        result1 /= 4;
        result1 %= 5;
    }
}
