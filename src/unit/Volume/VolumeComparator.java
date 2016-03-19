package unit.Volume;

import unit.length.LengthUnit;

public class VolumeComparator {
    private VolumeUnit value;
    private VolumeUnit otherValue;

    public VolumeComparator(Object value, Object otherValue) {
        if(value instanceof VolumeUnit && otherValue instanceof VolumeUnit ){
        this.value = value;
        this.otherValue = otherValue;
    }
    public boolean compare(){
        return value.convertToBaseUnit() == otherValue.convertToBaseUnit();
    }
}
