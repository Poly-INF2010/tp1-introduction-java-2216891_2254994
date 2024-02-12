package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        super(createRectangleCoords(width, height));
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        super(createRectangleCoords(dimensions.X(), dimensions.Y()));
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(super.cloneCoords());
    }

    /**
     * Creates a collection of 2D points representing a Rectangle
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     * @return Collection of 2D points representing the rectangle
     */
    private static Collection<Point2d> createRectangleCoords(Double width, Double height) {
        Collection<Point2d> coords = new ArrayList<>();
        Double halfWidth = width / 2.0;
        Double halfHeight = height / 2.0;

        for (double x = -halfWidth; x <= halfWidth; x += 0.5) {
            for (double y = -halfHeight; y <= halfHeight; y += 0.5) {
                coords.add(new Point2d(x, y));
            }
        }

        return coords;
    }
}
