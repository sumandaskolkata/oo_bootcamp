/*
    Job of the class
        Centimeter should have all behaviour and operation of length
 */
package unit.length;

import exception.NotValidLengthException;

public class Centimeter implements LengthUnit {

    private final double value;

    private Centimeter(double value) {
        this.value = value;
    }


    public static Centimeter create(double value) throws NotValidLengthException {
        if(value<0){
            throw new NotValidLengthException();
        }
        return new Centimeter(value);
    }

    @Override
    public double convertToBaseUnit() {
        return value/2.5;
    }
}
