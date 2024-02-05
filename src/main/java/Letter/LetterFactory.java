package Letter;

import Point.Point2d;
import Shape.*;  

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {

        BaseShape letterA = new BaseShape();

        // Create three rectangles for the letter A
        Rectangle angleRectangle1 = new Rectangle(stripeThickness, maxHeight);
        Rectangle angleRectangle2 = new Rectangle(stripeThickness, maxHeight);
        Rectangle horizontalRectangle = new Rectangle(stripeThickness, halfMaxHeight);

        angleRectangle1.rotate(angleRectangle1.getCoords(), 0.3490658504);
        angleRectangle2.rotate(angleRectangle2.getCoords(), -0.3490658504);
        horizontalRectangle.rotate(horizontalRectangle.getCoords(), Math.PI / 2);

        Point2d positionRectangle1 = new Point2d(horizontalRectangle.getMinX(), 50.0);
        Point2d positionRectangle2 = new Point2d(horizontalRectangle.getMaxX(), 50.0);
        Point2d positionHorizontalRectangle = new Point2d(0.0, 40.0);

        angleRectangle1.translate(angleRectangle1.getCoords(), positionRectangle1);
        angleRectangle2.translate(angleRectangle2.getCoords(), positionRectangle2);
        horizontalRectangle.translate(horizontalRectangle.getCoords(), positionHorizontalRectangle);

        letterA.add(angleRectangle1);
        letterA.add(angleRectangle2);
        letterA.add(horizontalRectangle);

        return letterA;

    }



    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {

        BaseShape letterB = new BaseShape();

        Ellipse topEllipse = new Ellipse(maxWidth, halfMaxHeight);
        Ellipse bottomEllipse = new Ellipse(maxWidth, halfMaxHeight);
        Ellipse innerEllipse = new Ellipse(maxWidth / 1.5, halfMaxHeight / 1.5);

        topEllipse.remove(innerEllipse);
        bottomEllipse.remove(innerEllipse);

        Point2d topEllipsePosition = new Point2d(0.0, halfMaxHeight / 2);
        Point2d bottomEllipsePosition = new Point2d(0.0, -(halfMaxHeight / 2));

        topEllipse.translate(topEllipse.getCoords(), topEllipsePosition);
        bottomEllipse.translate(bottomEllipse.getCoords(), bottomEllipsePosition);

        Rectangle verticalRectangle = new Rectangle(stripeThickness, maxHeight);

        Point2d verticalRectanglePosition = new Point2d(topEllipse.getMinX(), 0.0);
        verticalRectangle.translate(verticalRectangle.getCoords(), verticalRectanglePosition);

        letterB.add(topEllipse);
        letterB.add(bottomEllipse);
        letterB.add(verticalRectangle);

        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {

        BaseShape letterC = new BaseShape();

        Ellipse outerEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse innerEllipse = new Ellipse(maxWidth / 1.5, maxHeight / 1.5);

        Rectangle verticalRectangle = new Rectangle(stripeThickness + 30, maxHeight / 1.5);

        Point2d verticalRectanglePosition = new Point2d((outerEllipse.getMaxX() - 10), 0.0);
        verticalRectangle.translate(verticalRectangle.getCoords(), verticalRectanglePosition);

        outerEllipse.remove(innerEllipse);
        outerEllipse.remove(verticalRectangle);

        letterC.add(outerEllipse);

        return letterC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {

        BaseShape letterE = new BaseShape();

        Rectangle horizontalRectangle1 = new Rectangle(stripeThickness, maxHeight);
        Rectangle horizontalRectangle2 = new Rectangle(stripeThickness, maxHeight);
        Rectangle horizontalRectangle3 = new Rectangle(stripeThickness, maxHeight);
        Rectangle verticalRectangle = new Rectangle(stripeThickness, maxHeight);

        horizontalRectangle1.rotate(horizontalRectangle1.getCoords(), Math.PI / 2);
        horizontalRectangle2.rotate(horizontalRectangle2.getCoords(), Math.PI / 2);
        horizontalRectangle3.rotate(horizontalRectangle3.getCoords(), Math.PI / 2);

        double offset = 5.0;
        Point2d translation1 = new Point2d(0.0, -maxHeight + 20);
        Point2d translation2 = new Point2d(0.0, -halfMaxHeight + offset);
        Point2d translation3 = new Point2d(0.0, -offset);
        Point2d verticalRectangleTranslation = new Point2d(horizontalRectangle2.getMinX(), horizontalRectangle2.getMaxY());

        horizontalRectangle1.translate(horizontalRectangle1.getCoords(), translation1);
        horizontalRectangle2.translate(horizontalRectangle2.getCoords(), translation2);
        horizontalRectangle3.translate(horizontalRectangle3.getCoords(), translation3);
        verticalRectangle.translate(verticalRectangle.getCoords(), verticalRectangleTranslation);

        letterE.add(horizontalRectangle1);
        letterE.add(horizontalRectangle2);
        letterE.add(horizontalRectangle3);
        letterE.add(verticalRectangle);

        return letterE;

    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {


        BaseShape letterH = new BaseShape();
        Rectangle verticalRectangle1_H = new Rectangle(stripeThickness, maxHeight);
        Rectangle verticalRectangle2_H = new Rectangle(stripeThickness, maxHeight);
        Rectangle horizontalRectangle_H = new Rectangle(stripeThickness, halfMaxHeight);

        horizontalRectangle_H.rotate(horizontalRectangle_H.getCoords(), 1.5707963268);

        Point2d translation1_H = new Point2d(horizontalRectangle_H.getMinX(), 0.0);
        verticalRectangle1_H.translate(verticalRectangle1_H.getCoords(), translation1_H);

        Point2d translation2_H = new Point2d(horizontalRectangle_H.getMaxX(), 0.0);
        verticalRectangle2_H.translate(verticalRectangle2_H.getCoords(), translation2_H);

        Point2d translation3_H = new Point2d(0.0, -(verticalRectangle1_H.getMaxY() / 2) + 30.0);
        horizontalRectangle_H.translate(horizontalRectangle_H.getCoords(), translation3_H);

        letterH.add(verticalRectangle1_H);
        letterH.add(verticalRectangle2_H);
        letterH.add(horizontalRectangle_H);

        return letterH;    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {

        BaseShape letterN = new BaseShape();

        Rectangle verticalRectangle1_N = new Rectangle(stripeThickness, maxHeight);
        Rectangle verticalRectangle2_N = new Rectangle(stripeThickness, maxHeight);
        Rectangle angledRectangle_N = new Rectangle(stripeThickness, maxHeight);

        angledRectangle_N.rotate(angledRectangle_N.getCoords(), -0.7853981634);

        Point2d positionRectangle1_N = new Point2d((-50.0), 0.0);
        verticalRectangle1_N.translate(verticalRectangle1_N.getCoords(), positionRectangle1_N);

        Point2d positionRectangle2_N = new Point2d((50.0), 0.0);
        verticalRectangle2_N.translate(verticalRectangle2_N.getCoords(), positionRectangle2_N);

        Point2d positionAngledRectangle_N = new Point2d(0.0, 5.0);
        angledRectangle_N.translate(angledRectangle_N.getCoords(), positionAngledRectangle_N);

        letterN.add(verticalRectangle1_N);
        letterN.add(verticalRectangle2_N);
        letterN.add(angledRectangle_N);

        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {

        BaseShape letterO = new BaseShape();

        Ellipse outerEllipse_O = new Ellipse(halfMaxWidth, maxHeight);
        Ellipse innerEllipse_O = new Ellipse(halfMaxWidth / 1.5, maxHeight / 1.5);

        outerEllipse_O.removeAll(innerEllipse_O.getCoords());

        letterO.add(outerEllipse_O);

        return letterO;    }

}
