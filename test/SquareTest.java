import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void Square_should_throw_an_NonPositiveNumberException_when_the_side_is_less_than_one() throws NonPositiveNumberException {
        thrown.expect(NonPositiveNumberException.class);
        thrown.expectMessage("Expected positive value for square side but found -4");
        Square.createSquare(-4);
    }

    @Test
    public void calculateArea_should_return_area_of_the_square() throws NonPositiveNumberException {
        Square square = Square.createSquare(5);
        assertEquals(25, square.calculateArea(), .5);
    }

    @Test
    public void calculatePerimeter_should_return_the_perimetr_of_the_square() throws NonPositiveNumberException {
        Square square = Square.createSquare(10);
        assertEquals(40, square.calculatePerimeter(), .5);

    }
}