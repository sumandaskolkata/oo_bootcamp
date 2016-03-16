
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class RectangleTest {
    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(10, 5);
    }

    @Test
    public void testCalculateAreaShouldGiveAreaOfARectangle() throws Exception {
        assertEquals(rectangle.calculateArea(),50);
    }

    @Test
    public void testCalculatePerimeterShouldGivePerimeterOfARectangle() throws Exception {
        assertEquals(rectangle.calculatePerimiter(),30);
    }
}