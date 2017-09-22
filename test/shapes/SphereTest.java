package shapes;

import org.junit.Test;

import static org.junit.Assert.*;

/** Test case for Sphere */
public class SphereTest {

    /**
     * This test will show weather Sphere.area() works or not.
     * Input: radius: 1.5
     * ExpectOutput: 28.27
     */
    @Test
    public void area() {
        Sphere s = new Sphere(1.5);
        assertEquals(CircleTest.df.format(28.27), CircleTest.df.format(s.area()));
    }

    /**
     * This test will show weather Sphere.volume() works or not.
     * Input: radius: 1.5
     * ExpectOutput: 14.14
     */
    @Test
    public void volume() {
        Sphere s = new Sphere(1.5);
        assertEquals(CircleTest.df.format(14.14), CircleTest.df.format(s.volume()));
    }

}