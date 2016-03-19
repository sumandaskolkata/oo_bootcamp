/*
    Job of the class
        Inch should have all behaviour and operation of length
 */
package unit.length;

import exception.NotValidLengthException;

public class Inch implements LengthUnit {

    private final double value;

    private Inch(double value) {
        this.value = value;

    }
    public static Inch create(double value) throws NotValidLengthException {
        if(value<0){
            throw new NotValidLengthException();
        }
        return new Inch(value);
    }
    public Inch add(LengthUnit other) throws NotValidLengthException {
        return create(convertToBaseUnit()+other.convertToBaseUnit());
    }

    @Override
    public double convertToBaseUnit() {
        return value;
    }
}
