package Volume;

import exception.NotValidLengthException;
import exception.NotValidVolumeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import unit.Volume.VolumeComparator;
import unit.Volume.Gallon;
import unit.Volume.Liter;
import unit.length.Inch;

import static junit.framework.TestCase.assertTrue;

public class LiterTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void three_point_seven_eight_liter_should_be_equal_to_one_gallon() throws NotValidVolumeException {
        Liter liter = Liter.create(3.78);
        Gallon gallon = Gallon.create(1);
        VolumeComparator volumeComparator = new VolumeComparator(liter, gallon);
        assertTrue(volumeComparator.compare());
    }



    @Test
    public void one_gallon_plus_one_litter_should_be_four_point_seven_eigth_litter() throws NotValidVolumeException {
        Liter liter = Liter.create(1);
        Gallon gallon = Gallon.create(1);
        Liter result = liter.add(gallon);
        Liter expected = Liter.create(4.78);
        VolumeComparator volumeComparator = new VolumeComparator(result, expected);
        assertTrue(volumeComparator.compare());
    }
    @Test
    public void one_gallon_plus_one_inch_should_be_throw_exception() throws NotValidVolumeException, NotValidLengthException {
        thrown.expect(NotValidVolumeException.class);
        thrown.expectMessage("Expected a volume but got not volume");
        Liter liter = Liter.create(1);
        Inch inch = Inch.create(3);
        liter.add(inch);
    }


}