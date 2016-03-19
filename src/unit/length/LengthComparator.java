package unit.length;

public class LengthComparator {
    private LengthUnit value;
    private LengthUnit otherValue;

    public LengthComparator(LengthUnit value, LengthUnit otherValue) {
        this.value = value;
        this.otherValue = otherValue;
    }
    public boolean compare(){
        return value.convertToBaseUnit() == otherValue.convertToBaseUnit();
    }
}
