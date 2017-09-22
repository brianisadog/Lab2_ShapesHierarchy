package comparators;

import org.junit.Test;
import shapes.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/** Test case for VolumeComparator */
public class VolumeComparatorTest {

    /**
     * This test will show weather the comparator works or not.
     * Input: sphere, platonic.
     * ExpectedOutput: platonic, sphere
     */
    @Test
    public void compare() {
        List<Shape> shapes = new ArrayList();
        Shape sphere = new Sphere(1);
        Shape platonic = new PlatonicSolid(4, 3, 1);

        shapes.add(sphere);
        shapes.add(platonic);

        Collections.sort(shapes, new VolumeComparator());

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(platonic.toString());
        sb.append(", ");
        sb.append(sphere.toString());
        sb.append("]");

        assertEquals(sb.toString(), shapes.toString());
    }

}