/*
job of Rectangle
    - all operation related to rectangle behaviour depending on length and width should be in this class.
*/
public class Rectangle {
    private final double height;
    private final double width;

    private Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    public static Rectangle createRectangle(double length, double width) throws NonPositiveNumberException {
        if (length <= 0 || width <= 0) {
            throw new NonPositiveNumberException("expected positive values for rectangle side but found length "+length+" width "+width);
        }
        return new Rectangle(length, width);
    }
}