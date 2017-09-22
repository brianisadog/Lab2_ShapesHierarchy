package shapes;

import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

/** Test case for Circle */
public class CircleTest {

    /**
     * DecimalFormat for every test case.
     */
    public static final DecimalFormat df = new DecimalFormat("#.00");

    /**
     * This test will show weather Circle.area() works or not.
     * Input: radius: 5
     * ExpectOutput: 5 * 5 * pi
     */
    @Test
    public void area(){
        Circle c = new Circle(5);
        assertEquals(df.format(5 * 5 * Math.PI), df.format(c.area()));
    }

    /**
     * This test will show weather Circle.perimeter() works or not.
     * Input: radius: 9.41
     * ExpectOutput: 9.41 * 2 * pi
     */
    @Test
    public void perimeter(){
        Circle c = new Circle(9.41);
        assertEquals(df.format(9.41 * 2 * Math.PI), df.format(c.perimeter()));
    }

}