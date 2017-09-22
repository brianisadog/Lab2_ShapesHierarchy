package comparators;

import org.junit.Test;
import shapes.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/** Test case for PerimeterComparator */
public class PerimeterComparatorTest {

    /**
     * This test will show weather the comparator works or not.
     * Input: circle, polygon.
     * ExpectedOutput: polygon, circle
     */
    @Test
    public void compare() {
        List<Shape> shapes = new ArrayList();
        Shape circle = new Circle(3);
        Shape polygon = new ConvexRegularPolygon(4, 3);

        shapes.add(circle);
        shapes.add(polygon);

        Collections.sort(shapes, new PerimeterComparator());

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(polygon.toString());
        sb.append(", ");
        sb.append(circle.toString());
        sb.append("]");

        assertEquals(sb.toString(), shapes.toString());
    }

}