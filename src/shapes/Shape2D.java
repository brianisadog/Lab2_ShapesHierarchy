package shapes;

/**
 * An abstract class Shape2D.
 * The child of Shape and the parent of Circle and ConvexRegularPolygon
 */
public abstract class Shape2D extends Shape {

    /**
     * An abstract method for computing the perimeter of the shape.
     *
     * @return perimeter of the shape
     */
    public abstract double perimeter();

    /**
     * Override the toString of class Shape and returns a string representation
     * of the shape in the following format: The name of the shape, 1 tab
     * , the area (formatted so that it only shows two digits after the decimal point)
     * , 1 tab , the perimeter (formatted so that it only shows two digits
     * after the decimal point)
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "\t" + df.format(perimeter());
    }
}
