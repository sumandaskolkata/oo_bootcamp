/*
    Job of the class
        Length should have all behaviour related to length
 */
package compareLength;

public abstract class Length {
   private final double value;

    protected Length(double value) {
        this.value = value;
    }
    protected double convertToInch() {
        return value/2.5;
    }

    private double convertInFeet() {
        return value/30;
    }
    private double convertInCentimeter() {
        return value;
    }
    private double convertInMelimeter(){
        return value*10;
    }
    public boolean compareLength(Length other){
        return value==other.value;
    }

}
