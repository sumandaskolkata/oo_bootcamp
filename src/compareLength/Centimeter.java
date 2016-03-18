/*
    Job of the class
        Centimeter should have all behaviour and operation of length
 */
package compareLength;

public class Centimeter extends Length{

    private Centimeter(double value) {
        super(value);
    }


    public static Centimeter create(double value) throws NotValidLengthException {
        if(value<0){
            throw new NotValidLengthException();
        }
        return new Centimeter(value);
    }
}
