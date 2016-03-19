/*
    Job of the class
        Liter all behaviour and operation are related to volume
 */
package unit.Volume;

import unit.length.LengthUnit;
import exception.NotValidVolumeException;

import java.util.Objects;

public class Liter implements VolumeUnit {
    private final double value;

    private Liter(double value) {

        this.value = value;
    }
    public static Liter create(double value) throws NotValidVolumeException {
        if(value<0){
            throw new NotValidVolumeException("Expected Volume to be positive but got negative");
        }
        return new Liter(value);
    }
    public Liter add(Object other) throws NotValidVolumeException {
        if(! (other instanceof VolumeUnit)) {
            throw new NotValidVolumeException("Expected a volume but got not volume");
        }
        VolumeUnit otherVolume = (VolumeUnit)other;
        double result = convertToBaseUnit() + otherVolume.convertToBaseUnit();
        return Liter.create(result*3.78);
    }

    @Override
    public double convertToBaseUnit() {
        return value/3.78;
    }
}
