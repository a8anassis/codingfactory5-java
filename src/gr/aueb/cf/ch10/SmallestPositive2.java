package gr.aueb.cf.ch10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Finds the smallest missing positive.
 */
public class SmallestPositive2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7};

        // Should return 5
        System.out.println(getSmallestPositive(arr));
    }

    public static int getSmallestPositive(int[] arr) {
        HashSet<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toCollection(HashSet::new));
        return IntStream.rangeClosed(1, arr.length + 1)
                .filter(i -> !set.contains(i))
                .findFirst()
                .orElse(-1);
    }
}
