/*
    Job of the class
        Liter all behaviour and operation are related to volume
 */
package Volume;

public class Liter extends Volume{
    private Liter(double value) {
        super(value);
    }
    public static Liter create(double value) throws NotValidVolumeException {
        if(value<0){
            throw new NotValidVolumeException();
        }
        return new Liter(value);
    }
}
