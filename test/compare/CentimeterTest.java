package compare;

import exception.NotValidLengthException;
import org.junit.Test;
import unit.length.Centimeter;
import unit.length.LengthComparator;
import unit.length.Inch;

import static org.junit.Assert.*;

public class CentimeterTest {
    @Test
    public void two_poin_five_centimeter_equal_to_one_inch() throws NotValidLengthException {
        Centimeter centimeter = Centimeter.create(2.5);
        Inch inch = Inch.create(1);
        LengthComparator lengthComparator = new LengthComparator(centimeter, inch);
        assertTrue(lengthComparator.compare());
    }

}