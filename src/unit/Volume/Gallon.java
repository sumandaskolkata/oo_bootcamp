/*
    Job of the class
        Gallon all behaviour and operation of volume
 */

package unit.Volume;

import unit.length.LengthUnit;
import exception.NotValidVolumeException;

public class Gallon implements VolumeUnit {
    private final double value;

    private Gallon(double value) {

        this.value = value;
    }
    public static Gallon create(double value) throws NotValidVolumeException {
        if(value<0){
            throw new NotValidVolumeException("Expected Volume to be positive but got negative");
        }
        return new Gallon(value);
    }


    @Override
    public double convertToBaseUnit() {
        return value;
    }
}
