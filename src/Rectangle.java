/*
job of Rectangle
 */
public class Rectangle {
    private final int height;
    private final int width;

    public Rectangle(int length, int width) {
        this.height = length;
        this.width = width;
    }

    public int calculateArea() {
        return height *width;
    }
    public int calculatePerimiter(){
        return 2*(height +width);
    }
}