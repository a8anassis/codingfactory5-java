package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * A binary gap within a positive integer N is any maximal sequence of
 * consecutive zeros that is surrounded by ones at both ends in the binary
 * representation of N.
 *
 * For example, number 9 has binary representation 1001 and contains a binary gap
 * of length 2. The number 529 has binary representation 1000010001 and contains
 * two binary gaps: one of length 4 and one of length 3. The number 20 has binary
 * representation 10100 and contains one binary gap of length 1. The number 15 has
 * binary representation 1111 and has no binary gaps. The number 32 has binary
 * representation 100000 and has no binary gaps.
 *
 * For example, given N = 1041 the function should return 5, because N has binary
 * representation 10000010001 and so its longest binary gap is of length 5. Given N = 32
 * the function should return 0, because N has binary representation '100000' and thus
 * no binary gaps.
 *
 * Write an efficient algorithm (O(n) Time Complexity).
 *
 */
public class MaxZerosShift {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int count = 0;
        boolean oneFlag = false;
        int max = 0;

        System.out.println("Please insert a number");
        n = in.nextInt();

        for (; n > 0; n >>= 1) {
            // if rightmost bit is one
            if (n % 2 != 0) {
                oneFlag = true;
                if (count > max) {
                    max = count;
                }
                count = 0;
            } else if (oneFlag) {
                count++;
            }
        }
        System.out.println("Zeros: " + max);
    }
}
