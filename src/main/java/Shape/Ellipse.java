package Shape;

import Point.Point2d;
import java.util.ArrayList;
import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super(createEllipseCoords(widthDiameter, heightDiameter));
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        super(createEllipseCoords(dimensions.X(), dimensions.Y()));
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(super.cloneCoords());
    }

    /**
     * Creates a collection of 2D points representing an Ellipse
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     * @return Collection of 2D points representing the Ellipse
     */
    private static Collection<Point2d> createEllipseCoords(Double widthDiameter, Double heightDiameter) {
        Collection<Point2d> coords = new ArrayList<>();
        Double radiusX = widthDiameter / 2.0;
        Double radiusY = heightDiameter / 2.0;

        for (double x = -radiusX; x <= radiusX; x += 0.5) {
            for (double y = -radiusY; y <= radiusY; y += 0.5) {
                if(Math.pow(x/radiusX, 2)+Math.pow(y/radiusY,2)<=1){
                    coords.add(new Point2d(x, y));
                }
            }
        }

        return coords;
    }
}