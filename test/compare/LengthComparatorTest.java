package compare;

import exception.NotValidLengthException;
import org.junit.Test;
import unit.length.LengthComparator;
import unit.length.Feet;
import unit.length.Inch;

import static org.junit.Assert.*;

public class LengthComparatorTest {
    @Test
    public void compareShouldTakeTwoUnitAndGiveTwoWhenBothAreEqual() throws NotValidLengthException {
        Feet feet = Feet.create(1);
        Inch inch = Inch.create(12);
        LengthComparator lengthComparator = new LengthComparator(feet, inch);
        assertTrue(lengthComparator.compare());
    }
}