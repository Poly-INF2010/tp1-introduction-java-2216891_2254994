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

        Rectangle leftVerticalBar = new Rectangle(stripeThickness, maxHeight);
        leftVerticalBar.translate(leftVerticalBar.getCoords(), new Point2d(-halfMaxWidth + halfStripeThickness, 0.0));
        leftVerticalBar.rotate(leftVerticalBar.getCoords(), Math.toRadians(15)); // Rotation vers la droite

        Rectangle rightVerticalBar = new Rectangle(stripeThickness, maxHeight);
        rightVerticalBar.translate(rightVerticalBar.getCoords(), new Point2d(halfMaxWidth - halfStripeThickness, 0.0));
        rightVerticalBar.rotate(rightVerticalBar.getCoords(), Math.toRadians(-15)); // Rotation vers la gauche

        Rectangle middleBar = new Rectangle(maxWidth - stripeThickness, stripeThickness);
        middleBar.translate(middleBar.getCoords(), new Point2d(0.0, 0.0));

        letterA.add(leftVerticalBar);
        letterA.add(rightVerticalBar);
        letterA.add(middleBar);

        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape letterB = new BaseShape();

        Rectangle verticalLine = new Rectangle(stripeThickness, maxHeight);
        verticalLine.translate(verticalLine.getCoords(), new Point2d(-halfMaxWidth, -halfMaxHeight));

        Circle topCircle = new Circle(halfMaxHeight);
        Circle circleToRemove = new Circle(halfMaxHeight-stripeThickness);
        topCircle.remove(circleToRemove);

        topCircle.translate(topCircle.getCoords(), new Point2d(0.0, -halfMaxHeight/2));

        Circle bottomCircle = new Circle(halfMaxHeight);
        bottomCircle.remove(circleToRemove);

        bottomCircle.translate(bottomCircle.getCoords(), new Point2d(0.0, -halfMaxHeight-halfMaxHeight/2));

        letterB.add(verticalLine);
        letterB.add(topCircle);
        letterB.add(bottomCircle);

        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape letterC = new BaseShape();

        Ellipse oval = new Ellipse(maxWidth, maxHeight);

        Ellipse middleOval = new Ellipse(maxWidth-stripeThickness,maxHeight-stripeThickness);
        oval.remove(middleOval);

        Rectangle toRemove = new Rectangle(2*stripeThickness, maxHeight-2*stripeThickness);
        toRemove.translate(toRemove.getCoords(), new Point2d(maxWidth-2*stripeThickness, 0.0));

        letterC.add(oval);
        letterC.remove(toRemove);

        return letterC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape letterE = new BaseShape();

        Rectangle verticalBar = new Rectangle(stripeThickness, maxHeight);
        verticalBar.translate(verticalBar.getCoords(), new Point2d(-halfMaxWidth + halfStripeThickness, 0.0));

        Rectangle topBar = new Rectangle(maxWidth, stripeThickness);
        topBar.translate(topBar.getCoords(), new Point2d(0.0, -halfMaxHeight));

        Rectangle middleBar = new Rectangle(maxWidth - stripeThickness, stripeThickness);

        Rectangle bottomBar = new Rectangle(maxWidth, stripeThickness);
        bottomBar.translate(bottomBar.getCoords(), new Point2d(0.0, halfMaxHeight-stripeThickness));

        letterE.add(verticalBar);
        letterE.add(topBar);
        letterE.add(middleBar);
        letterE.add(bottomBar);

        return letterE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape letterH = new BaseShape();

        Rectangle leftVerticalBar = new Rectangle(stripeThickness, maxHeight);
        leftVerticalBar.translate(leftVerticalBar.getCoords(), new Point2d(-halfMaxWidth + halfStripeThickness, 0.0));

        Rectangle rightVerticalBar = new Rectangle(stripeThickness, maxHeight);
        rightVerticalBar.translate(rightVerticalBar.getCoords(), new Point2d(halfMaxWidth - halfStripeThickness, 0.0));

        Rectangle middleBar = new Rectangle(maxWidth - stripeThickness, stripeThickness);

        letterH.add(leftVerticalBar);
        letterH.add(rightVerticalBar);
        letterH.add(middleBar);

        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape letterN = new BaseShape();

        Rectangle leftVerticalBar = new Rectangle(stripeThickness, maxHeight);
        leftVerticalBar.translate(leftVerticalBar.getCoords(), new Point2d(-halfMaxWidth + halfStripeThickness, 0.0));

        Rectangle rightVerticalBar = new Rectangle(stripeThickness, maxHeight);
        rightVerticalBar.translate(rightVerticalBar.getCoords(), new Point2d(halfMaxWidth - halfStripeThickness, 0.0));

        Rectangle diagonalBar = new Rectangle(stripeThickness, maxHeight);
        diagonalBar.translate(diagonalBar.getCoords(), new Point2d(halfMaxWidth/4 - halfStripeThickness, 0.0));
        diagonalBar.rotate(diagonalBar.getCoords(), Math.toRadians(-15.0)); // Rotation vers la gauche

        letterN.add(leftVerticalBar);
        letterN.add(rightVerticalBar);
        letterN.add(diagonalBar);

        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape letterO = new BaseShape();

        Ellipse mainEllipse = new Ellipse(maxWidth,maxHeight);

        Ellipse middleEllipse = new Ellipse(maxWidth-stripeThickness,maxHeight-stripeThickness);

        letterO.add(mainEllipse);
        letterO.remove(middleEllipse);
        return letterO;
    }

}
