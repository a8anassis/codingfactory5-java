package gr.aueb.cf.ch14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Flyweight
 * Facade
 */
public class FlyweightApp {
    private static final List<ImmutablePoint> points = new ArrayList<>();

    private FlyweightApp() {

    }

    public static ImmutablePoint getFlyweightPoint(int x, int y) {
        ImmutablePoint point;
        int position = getPointPosition(x, y);

        if (position == -1) {
            point = new ImmutablePoint(x, y);
            points.add(point);
        } else {
            point = points.get(position);
        }

        return point;
    }

    private static int getPointPosition(int x, int y) {
        int positionToReturn = -1;

        for (int i = 0; i < points.size(); i++) {
            if ((points.get(i).getX() == x) && (points.get(i).getY() == y)) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
