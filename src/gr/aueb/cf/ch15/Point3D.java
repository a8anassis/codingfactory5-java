package gr.aueb.cf.ch15;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {

    }

    public Point3D(double x, double y, double z) {
        // constructor chaining
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

//    @Override
//    public String convertToString() {
//        return super.convertToString() + "(" + getZ() + ")";
//    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }
}
