/*
    Job of the class
        Volume all behaviour and operation of volume
 */
package Volume;

public class Volume {
    private final double value;

    public Volume(double value) {
        this.value = value;
    }
    public boolean compareVolume(Volume other){
        return value==other.value;
    }
}
