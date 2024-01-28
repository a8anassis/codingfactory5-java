package gr.aueb.cf.ch10;

public class FrogJumps2 {

    public static void main(String[] args) {
        int x = 10;
        int y = 85;
        int d = 20;

        System.out.println(getJumps(x, y, d));
    }

    public static int getJumps(int startPos, int endPos, int jmp) {

        return (int) Math.ceil((endPos - startPos) / (double) jmp);
    }
}
