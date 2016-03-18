/*
    Job of the class
        millimeter should have all behaviour and operation of length
 */
package compareLength;


public class Millimeter extends Length{

    private Millimeter(double value) {
        super(value);
    }


    public static Millimeter create(double value) throws NotValidLengthException {
        if(value<0){
            throw new NotValidLengthException();
        }
        double inCm = value/10;
        return new Millimeter(inCm);
    }

}

