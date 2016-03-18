package compareLength;

import org.junit.Test;

import static org.junit.Assert.*;

public class FeetTest {
    @Test
    public void FeetCompareShouldTakeAnyLengthAndConvertToFeetAndCompare() throws NotValidLengthException {
        Feet feet = Feet.create(1);
        Inch inch = Inch.create(12);
        assertTrue(feet.compareLength(inch));
    }
}