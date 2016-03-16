
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class RectangleTest {
    private Rectangle rectangleWithIntegerValue;
    private Rectangle rectangleWithDoubleValue;

    @Before
    public void setUp() throws Exception {
        rectangleWithIntegerValue = new Rectangle(10, 5);
        rectangleWithDoubleValue = new Rectangle(10.5, 5.3);

    }

    @Test
    public void testCalculateAreaShouldGiveAreaOfARectangleWhenSidesAreInteger() throws Exception {
        assertEquals(rectangleWithIntegerValue.calculateArea(),50,.5);
    }

    @Test
    public void testCalculatePerimeterShouldGivePerimeterOfARectangleWhenSidesAreInteger() throws Exception {
        assertEquals(rectangleWithIntegerValue.calculatePerimiter(),30,.5);
    }
    @Test
    public void testCalculateAreaShouldGiveAreaOfARectangleWhenSidesAreDouble() throws Exception {
        assertEquals(rectangleWithDoubleValue.calculateArea(),55.65,.5);
    }

    @Test
    public void testCalculatePerimeterShouldGivePerimeterOfARectangleWhenSidesAreDouble() throws Exception {
        assertEquals(rectangleWithDoubleValue.calculatePerimiter(),31.6,.5);
    }
}