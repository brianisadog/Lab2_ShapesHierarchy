package comparators;

import org.junit.Test;
import shapes.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/** Test case for NameComparator */
public class NameComparatorTest {

    /**
     * This test will show weather the comparator works or not.
     * Input: sphere, circle.
     * ExpectedOutput: circle, sphere
     */
    @Test
    public void compare() {
        List<Shape> shapes = new ArrayList();
        Shape circle = new Circle(3);
        Shape sphere = new Sphere(3);

        shapes.add(sphere);
        shapes.add(circle);

        Collections.sort(shapes, new NameComparator());

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(circle.toString());
        sb.append(", ");
        sb.append(sphere.toString());
        sb.append("]");

        assertEquals(sb.toString(), shapes.toString());
    }

}