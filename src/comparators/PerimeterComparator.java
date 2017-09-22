package comparators;

import shapes.Shape;
import shapes.Shape2D;
import java.util.Comparator;

public class PerimeterComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if (Math.abs(((Shape2D)o1).perimeter() - ((Shape2D)o2).perimeter()) < AreaComparator.EPS) {
            return 0;
        }
        else
        if (((Shape2D)o1).perimeter() < ((Shape2D)o2).perimeter())
            return -1;
        else
            return 1;
    }
}
