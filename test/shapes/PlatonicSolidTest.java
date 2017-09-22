package shapes;

import org.junit.Test;

import static org.junit.Assert.*;

/** Test case for PlatonicSolid */
public class PlatonicSolidTest {

    /**
     * This test will show weather PlatonicSolid.area() works or not.
     * Input: edge: 3, face: 4, length: 5
     * ExpectOutput: 86.60
     */
    @Test
    public void area() {
        PlatonicSolid ps = new PlatonicSolid(3, 4, 5);
        assertEquals(CircleTest.df.format(86.60), CircleTest.df.format(ps.area()));
    }

    /**
     * This test will show weather PlatonicSolid.volume() works or not.
     * Input: edge: 3, face: 4, length: 5
     * ExpectOutput: 58.93
     */
    @Test
    public void volume() {
        PlatonicSolid ps = new PlatonicSolid(3, 4, 5);
        assertEquals(CircleTest.df.format(58.93), CircleTest.df.format(ps.volume()));
    }

}