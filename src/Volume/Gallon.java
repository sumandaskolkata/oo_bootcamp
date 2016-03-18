/*
    Job of the class
        Gallon all behaviour and operation of volume
 */

package Volume;

public class Gallon extends Volume{
    private Gallon(double value) {
        super(value);
    }
    public static Gallon create(double value) throws NotValidVolumeException {
        if(value<0){
            throw new NotValidVolumeException();
        }
        double inLiter = value*3.78541;
        return new Gallon(value);
    }
}
