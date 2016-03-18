/*
    Job of the class
        Inch should have all behaviour and operation of length
 */
package compareLength;

public class Inch extends Length {

    private Inch(double value) {
        super(value);
    }
    public static Inch create(double value) throws NotValidLengthException {
        if(value<0){
            throw new NotValidLengthException();
        }
        double inCM=(value*2.5);
        return new Inch(inCM);
    }
    public Inch add(Length other) throws NotValidLengthException {
        return create(super.convertToInch()+other.convertToInch());
    }
}
