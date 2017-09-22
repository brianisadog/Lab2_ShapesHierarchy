package shapes;

/** A subclass of Shape and Shape3D that define the object PlatonicSolid */
public class PlatonicSolid extends Shape3D {
    private int edge, face;
    private double length;

    /**
     * Initialize the PlatonicSolid, set edge, face and length from input.
     *
     * @param e
     *        - The number of edge(s) of each face.
     * @param f
     *        - The number of face(s) of each vertex.
     * @param l
     *        - The length of each edge.
     */
    public PlatonicSolid (int e, int f, double l) {
        this.edge = e;
        this.face = f;
        this.length = l;
    }

    /**
     * Return the surface area of PlatonicSolid.
     * Surface area = (length/2)^2 * F * edge * cot(pi/edge)
     * F = (4 * face) / (4 - (edge - 2) * (face - 2))
     *
     * @return double
     */
    @Override
    public double area() {
        double bigF = (4 * face) / (4 - (edge - 2) * (face - 2));
        return (Math.pow((length / 2), 2) * bigF * edge) / (Math.tan(Math.PI / edge));
    }

    /**
     * Return the volume of PlatonicSolid.
     * Volume = area * inradius / 3
     * Inradius = (length/2) * cot(Theta/2) * tan(pi/edge)
     * cot(Theta/2) = 1/tan(Theta/2)
     * tan(Theta/2) = sin(Theta/2) / cos(Theta/2)
     * cos(Theta/2) = sqrt(1 - (sin(Theta/2))^2)
     * sin(Theta/2) = cos(pi/face) / sin(pi/edge)
     *
     * @return double
     */
    @Override
    public double volume() {
        double sinHalfTheta, cosHalfTheta, inradius;

        sinHalfTheta = (Math.cos(Math.PI / face) / Math.sin(Math.PI / edge));
        cosHalfTheta = Math.sqrt(1 - Math.pow(sinHalfTheta, 2));
        inradius = (length/ 2) * (sinHalfTheta/cosHalfTheta) / (Math.tan(Math.PI/ edge));

        return area() * inradius / 3;
    }
}
