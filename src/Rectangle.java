/*
job of Rectangle
    - Perform all operations related to breadth and/or height.
 */
public class Rectangle {
    private final double height;
    private final double width;

    public Rectangle(double length, double width) {
        this.height = length;
        this.width = width;
    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimiter() {
        return 2 * (height + width);
    }
}