import exception.InvalidProbabilityException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ChanceTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void chanceShouldThrowAnExceptionWhenGivenProbabilityIsLessThanZero() throws InvalidProbabilityException {
        thrown.expect(InvalidProbabilityException.class);
        thrown.expectMessage("Expected probability to be garter then zero and less than one");
        Chance.create(-0.1);
    }
    @Test
    public void chanceShouldThrowAnExceptionWhenGivenProbabilityIsGraterThanOne() throws InvalidProbabilityException {
        thrown.expect(InvalidProbabilityException.class);
        thrown.expectMessage("Expected probability to be garter then zero and less than one");
        Chance.create(1.4);
    }

    @Test
    public void chanceShouldRepresentTheProbabilityOfOccurrence() throws InvalidProbabilityException {
        Chance gettingATailChance = Chance.create(.5);
        Chance expected = Chance.create(.5);
        assertEquals(expected,gettingATailChance);
    }
    @Test
    public void chanceShouldGiveTheProbabilityOfNotOccurrence() throws InvalidProbabilityException {
        Chance gettingATailChance = Chance.create(.5);
        Chance expected = Chance.create(.5);
        assertEquals(expected,gettingATailChance.not());
    }
    @Test
    public void chanceShouldGiveTheProbabilityOfOccurrenceBothEvents() throws InvalidProbabilityException {
        Chance gettingATailChance = Chance.create(.5);
        assertEquals(Chance.create(.25),gettingATailChance.and(gettingATailChance));
    }
    @Test
    public void chanceShouldGiveTheProbabilityOfAtLeastOneEventOccurrence() throws InvalidProbabilityException {
        Chance gettingATailChance = Chance.create(.5);
        assertEquals(Chance.create(.75),gettingATailChance.or(gettingATailChance));
    }
}