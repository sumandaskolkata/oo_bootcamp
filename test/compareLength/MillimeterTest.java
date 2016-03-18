package compareLength;

import org.junit.Test;

import static org.junit.Assert.*;

public class MillimeterTest {
    @Test
    public void ren_Millimeter_should_be_qeual_to_one_cm() throws NotValidLengthException {
        Centimeter centimeter = Centimeter.create(1);
        Millimeter millimeter = Millimeter.create(10);
        assertTrue(centimeter.compareLength(millimeter));

    }
}