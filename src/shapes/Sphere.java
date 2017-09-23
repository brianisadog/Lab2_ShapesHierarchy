package shapes;

/** A subclass of Shape and Shape3D that define the object Sphere */
public class Sphere extends Shape3D {
    private double radius;

    /**
     * Initialize the Sphere, set radius.
     *
     * @param r
     *        - The radius of Sphere.
     */
    public Sphere (double r) {
        this.radius = r;
    }

    /**
     * Return the radius of this sphere.
     *
     * @return double
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Return the surface area of the Sphere.
     * Surface area = 4 * (radius^2) * pi
     *
     * @return double
     */
    @Override
    public double area() {
        return 4 * Math.pow(radius, 2) * Math.PI;
    }

    /**
     * Return the volume of the Sphere.
     * Volume = (4/3) * (radius^3) * pi
     *
     * @return double
     */
    @Override
    public double volume() {
        return (Math.pow(radius, 3) * Math.PI * 4) / 3;
    }
}
