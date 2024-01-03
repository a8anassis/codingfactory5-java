package gr.aueb.cf.ch11.model;

public class ImmutablePoint3D {
    private final Point point;    // composition
    private final int z;

    public ImmutablePoint3D() {
        point = new Point();
        z  = 0;
    }

    public ImmutablePoint3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY());     // deep copy
        this.z = z;
    }

    public Point getPoint() {
        return new Point(point.getX(), point.getY());   // deep copy, defensive copy
    }

    public int getZ() {
        return z;
    }
}
