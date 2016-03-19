package compare;

import exception.NotValidLengthException;
import org.junit.Test;
import unit.length.Centimeter;
import unit.length.LengthComparator;
import unit.length.Feet;
import unit.length.Inch;

import static org.junit.Assert.*;

public class InchTest {
    @Test
    public void twelve_inc_should_be_equal_to_one_feet() throws NotValidLengthException {
        Feet feet = Feet.create(1);
        Inch inch = Inch.create(12);
        LengthComparator lengthComparator = new LengthComparator(inch, feet);
        assertTrue(lengthComparator.compare());
    }

    @Test
    public void AdditionOfTwoInchWithTwoInchShouldGiveFourInch() throws NotValidLengthException {
        Inch twoInch = Inch.create(2);
        Inch anotherTeoInch = Inch.create(2);
        Inch fourInch = Inch.create(4);
        Inch result = twoInch.add(anotherTeoInch);
        LengthComparator lengthComparator = new LengthComparator(result, fourInch);
        assertTrue(lengthComparator.compare());
    }
    @Test
    public void AdditionOfTwoInchWithTwoPointFiveCentimeterShouldGiveThreeInch() throws NotValidLengthException {
        Inch twoInch = Inch.create(2);
        Centimeter twoPointFive = Centimeter.create(2.5);
        Inch expected = Inch.create(3);
        Inch result = twoInch.add(twoPointFive);
        LengthComparator lengthComparator = new LengthComparator(result, expected);
        assertTrue(lengthComparator.compare());
    }
}