package shapes;

/** A subclass of Shape and Shape2D that define the object Circle */
public class Circle extends Shape2D {
    private double radius;

    /**
     * Initialize the Circle, set radius from input.
     *
     * @param r
     *        - The radius of circle.
     */
    public Circle (double r) {
        this.radius = r;
    }

    /**
     * Return the radius of this circle.
     *
     * @return double
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Return the area of this circle. Area = (radius^2) * pi
     *
     * @return double
     */
    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    /**
     * Return the perimeter of this circle. Perimeter = (radius * 2) * pi
     *
     * @return double
     */
    @Override
    public double perimeter() {
        return radius * 2 * Math.PI;
    }
}
