package shapes;

import org.junit.Test;

import static org.junit.Assert.*;

/** Test case for ConvexRegularPolygonTest */
public class ConvexRegularPolygonTest {

    /**
     * This test will show weather ConvexRegularPolygon.area() works or not.
     * Input: edge: 4, length: 3
     * ExpectOutput: 3 * 3
     */
    @Test
    public void area() {
        ConvexRegularPolygon crp = new ConvexRegularPolygon(4, 3);
        assertEquals(CircleTest.df.format((double)3 * 3), CircleTest.df.format(crp.area()));
    }

    /**
     * This test will show weather ConvexRegularPolygon.perimeter() works or not.
     * Input: edge: 4, length: 3
     * ExpectOutput: 4 * 3
     */
    @Test
    public void perimeter() {
        ConvexRegularPolygon crp = new ConvexRegularPolygon(4, 3);
        assertEquals(CircleTest.df.format((double)4 * 3), CircleTest.df.format(crp.perimeter()));
    }

}