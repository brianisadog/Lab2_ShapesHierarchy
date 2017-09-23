package shapes;

/** A subclass of Shape and Shape2D that define the object ConvexRegularPolygon */
public class ConvexRegularPolygon extends Shape2D {
    private int edge;
    private double length;

    /**
     * Initialize the ConvexRegularPolygon, set edge and length from input.
     *
     * @param e
     *        - The number of edge(s) of the ConvexRegularPolygon.
     * @param l
     *        - The length of each edge.
     */
    public ConvexRegularPolygon(int e, double l) {
        this.edge = e;
        this.length = l;
    }

    /**
     * Return the number of edge(s) of this ConvexRegularPolygon.
     *
     * @return double
     */
    public double getEdge() {
        return this.edge;
    }

    /**
     * Return the length of each edge of this ConvexRegularPolygon.
     *
     * @return double
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Return the area of ConvexRegularPolygon.
     * Area = (1/4) * edge * (length^2) * cot(pi/edge)
     *
     * @return double
     */
    @Override
    public double area() {
        return (edge * Math.pow(length, 2)) / (4 * Math.tan ((Math.PI) / edge));
    }

    /**
     * Return the perimeter of ConvexRegularPolygon.
     * Perimeter = edge * length
     *
     * @return double
     */
    @Override
    public double perimeter() {
        return edge * length;
    }
}
