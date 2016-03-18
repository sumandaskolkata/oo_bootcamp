/*
    Job Of Chance is to calculate the chance of something happening.

 */

import exception.InvalidProbabilityException;


public class Chance {
    private final double value;

    private Chance(double value) {
        this.value = value;
    }
    public static Chance create(double value) throws InvalidProbabilityException {
        if(value >1 || value < 0){
            throw new InvalidProbabilityException();
        }
        return new Chance(value);
    }

    public Chance not() throws InvalidProbabilityException {
        return create(1-value);
    }
    public Chance and(Chance anotherChance) throws InvalidProbabilityException {
        return create(value*anotherChance.value);
    }
    public Chance or(Chance anotherChance) throws InvalidProbabilityException {
        return not().and(anotherChance.not()).not();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chance chance = (Chance) o;

        return Double.compare(chance.value, value) == 0;

    }
}
