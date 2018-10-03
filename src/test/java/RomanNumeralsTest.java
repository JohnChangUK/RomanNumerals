import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralsTest {

    @Test
    public void givenAnyNumberThenConvertToRomanNumeralFormat() {
        assertEquals("CXXV", RomanNumerals.convertNumberToNumeral(125));
        assertEquals("CCLVI", RomanNumerals.convertNumberToNumeral(256));
        assertEquals("XLIV", RomanNumerals.convertNumberToNumeral(44));
        assertEquals("XCVIII", RomanNumerals.convertNumberToNumeral(98));
        assertEquals("MMDCLXVI", RomanNumerals.convertNumberToNumeral(2666));
    }

}