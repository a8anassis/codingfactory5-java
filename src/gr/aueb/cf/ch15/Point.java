package gr.aueb.cf.ch15;

public class Point {
    private double x;

    public Point() {

    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

//    public String convertToString() {
//        return "(" + x + ")";
//    }


    @Override
    public String toString() {
        return "(" + x + ")";
    }

    public void movePlus10() {
        // x += 10;

        // self-use
        for (int i = 1; i <= 10; i++) {
            movePlusOne();
        }
    }

    protected void movePlusOne() {
        x += 1;
    }

    protected void printTypeOf() {
        System.out.println(this.getClass().getSimpleName());
    }

    private void reset() {
        x = 0;
    }
}
