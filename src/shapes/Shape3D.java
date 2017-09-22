package shapes;

/**
 * An abstract class Shape3D.
 * The child of Shape and the parent of Sphere and PlatonicSolid
 */
public abstract class Shape3D extends Shape {

    /**
     * An abstract method for computing the volume of the shape.
     *
     * @return volume of the shape
     */
    public abstract double volume();

    /**
     * Override the toString of class Shape and returns a string representation
     * of the shape in the following format: The name of the shape, 1 tab
     * , the surface area (formatted so that it only shows two digits after
     * the decimal point) , 1 tab , the volume (formatted so that it only
     * shows two digits after the decimal point)
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "\t" + df.format(volume());
    }
}
