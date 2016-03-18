package compareLength;

import org.junit.Test;

import static org.junit.Assert.*;

public class InchTest {
    @Test
    public void twelve_inc_should_be_equal_to_one_feet() throws NotValidLengthException {
        Feet feet = Feet.create(1);
        Inch inch = Inch.create(12);
        assertTrue(feet.compareLength(inch));
    }

    @Test
    public void AdditionOfTwoInchWithTwoInchShouldGiveFourInch() throws NotValidLengthException {
        Inch twoInch = Inch.create(2);
        Inch anotherTeoInch = Inch.create(2);
        Inch fourInch = Inch.create(4);
        assertTrue(twoInch.add(anotherTeoInch).compareLength(fourInch));
    }
    @Test
    public void AdditionOfTwoInchWithTwoPointFiveCentimeterShouldGiveThreeInch() throws NotValidLengthException {
        Inch twoInch = Inch.create(2);
        Centimeter twoPointFive = Centimeter.create(2.5);
        Inch expected = Inch.create(3);
        assertTrue(twoInch.add(twoPointFive).compareLength(expected));
    }
}