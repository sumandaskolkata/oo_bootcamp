package compare;

import exception.NotValidLengthException;
import org.junit.Test;
import unit.length.Centimeter;
import unit.length.LengthComparator;
import unit.length.Millimeter;

import static org.junit.Assert.*;

public class MillimeterTest {
    @Test
    public void one_Millimeter_should_be_qeual_to_one_cm() throws NotValidLengthException {
        Centimeter centimeter = Centimeter.create(1);
        Millimeter millimeter = Millimeter.create(10);
        LengthComparator lengthComparator = new LengthComparator(centimeter, millimeter);
        assertTrue(lengthComparator.compare());
    }

    @Test
    public void two_Millimeter_should_not_be_qeual_to_one_cm() throws NotValidLengthException {
        Centimeter centimeter = Centimeter.create(2);
        Millimeter millimeter = Millimeter.create(10);
        LengthComparator lengthComparator = new LengthComparator(centimeter, millimeter);
        assertFalse(lengthComparator.compare());
    }
}