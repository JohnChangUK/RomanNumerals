import static org.junit.Assert.*;

import exceptions.InvalidNumberException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RomanNumeralTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void givenAnyNumberThenConvertToRomanNumeralFormat() throws InvalidNumberException {
        assertEquals("I", RomanNumerals.convertNumberToNumeral(1));
        assertEquals("II", RomanNumerals.convertNumberToNumeral(2));
        assertEquals("IV", RomanNumerals.convertNumberToNumeral(4));
        assertEquals("V", RomanNumerals.convertNumberToNumeral(5));
        assertEquals("IX", RomanNumerals.convertNumberToNumeral(9));
        assertEquals("X", RomanNumerals.convertNumberToNumeral(10));
        assertEquals("XLIV", RomanNumerals.convertNumberToNumeral(44));
        assertEquals("CCCLXVIII", RomanNumerals.convertNumberToNumeral(368));
    }

    @Test
    public void givenTheNumberZeroThenThrowException() throws InvalidNumberException {
        expectedException.expect(InvalidNumberException.class);
        expectedException.expectMessage("Invalid number given, enter a number greater than zero");
        RomanNumerals.convertNumberToNumeral(0);
    }

    @Test
    public void givenTAnInvalidNumberThenThrowException() throws InvalidNumberException {
        expectedException.expect(InvalidNumberException.class);
        expectedException.expectMessage("Invalid number given, enter a number greater than zero");
        RomanNumerals.convertNumberToNumeral(-35);
    }

}