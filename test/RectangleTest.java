
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class RectangleTest {
    private Rectangle rectangle;

    @Before
    public void setUp() throws NonPositiveNumberException {
        rectangle = Rectangle.createRectangle(10, 5);

    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void calculateAreaShouldGiveAreaOfARectangleWhenSidesAreInteger(){
        assertEquals(rectangle.calculateArea(), 50, .0);
    }

    @Test
    public void calculatePerimeterShouldGivePerimeterOfARectangleWhenSidesAreInteger(){
        assertEquals(rectangle.calculatePerimeter(), 30, .0);
    }

    @Test
    public void createRectangleShouldThrowNonPositiveNumberExceptionWhenRectangleWidthIsNegative() throws NonPositiveNumberException {
        thrown.expectMessage("expected positive values for rectangle side but found length 3.0 width -6.0");
        thrown.expect(NonPositiveNumberException.class);
        Rectangle.createRectangle(3, -6);
    }

}