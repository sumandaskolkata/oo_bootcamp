/*
    Job of the class
        Feet all behaviour and operation of length
 */
package compareLength;

public class Feet extends Length {

    private Feet(double value) {
       super(value);
    }
    public static Feet create(double value) throws NotValidLengthException {
        if(value<0){
            throw new NotValidLengthException();
        }
        double inCM=(value*30);
        return new Feet(inCM);
    }
}
