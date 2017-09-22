package comparators;

import shapes.Shape;
import shapes.Shape3D;
import java.util.Comparator;

public class VolumeComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if (Math.abs(((Shape3D)o1).volume() - ((Shape3D)o2).volume()) < AreaComparator.EPS) {
            return 0;
        }
        else
        if (((Shape3D)o1).volume() < ((Shape3D)o2).volume())
            return -1;
        else
            return 1;
    }
}