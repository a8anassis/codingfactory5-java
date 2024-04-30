package gr.aueb.cf6.ch7;

import java.time.LocalDateTime;

public class StrBuilderApp_13 {

    public static void main(String[] args) {
        String s = "";
        StringBuilder sb = new StringBuilder();
        long timeElapsed;
        long start, end;

        start = System.currentTimeMillis();
        for (int i = 1; i < 100_000; i++) {
            s += i;
        }
        end = System.currentTimeMillis();
        System.out.printf("String Elapsed: %.3f sec.\n", (end - start) / 1000.0);

        start = System.currentTimeMillis();
        for (int i = 1; i < 100_000; i++) {
            sb = sb.append(i);
        }
        end = System.currentTimeMillis();
        System.out.printf("SB Elapsed: %.3f sec.", (end - start) / 1000.0);

    }
}
