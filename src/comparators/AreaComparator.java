package comparators;

import shapes.Shape;
import java.util.Comparator;

public class AreaComparator implements Comparator<Shape> {
    public final static double EPS  = 0.001;

    @Override
    public int compare(Shape o1, Shape o2) {
        if (Math.abs(o1.area() - o2.area()) < EPS ) {
            return 0;
        }
        else
        if (o1.area() < o2.area())
            return -1;
        else
            return 1;
    }
}
