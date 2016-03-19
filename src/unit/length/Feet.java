/*
    Job of the class
        Feet all behaviour and operation of length
 */
package unit.length;

import exception.NotValidLengthException;

public class Feet implements LengthUnit {

    private final double value;

    private Feet(double value){
        this.value = value;
    }
    public static Feet create(double value) throws NotValidLengthException {
        if(value<0){
            throw new NotValidLengthException();
        }
        return new Feet(value);
    }

    @Override
    public double convertToBaseUnit() {
        return value*12;
    }
}
