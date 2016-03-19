/*
    Job of the class
        millimeter should have all behaviour and operation of length
 */
package unit.length;


import exception.NotValidLengthException;

public class Millimeter implements LengthUnit {

    private final double value;

    private Millimeter(double value) {

        this.value = value;
    }


    public static Millimeter create(double value) throws NotValidLengthException {
        if(value<0){
            throw new NotValidLengthException();
        }
        return new Millimeter(value);
    }

    @Override
    public double convertToBaseUnit() {
        return value/25;
    }
}

