package IBANValidatorDE;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IBANValidatorDETest {
    @Test
    public void testIBAN() {
        IBANValidatorDE ibanValidatorDE = new IBANValidatorDE();

        assertTrue(ibanValidatorDE.isValid("DE07123412341234123412"));
        assertTrue(ibanValidatorDE.isValid("DE74 4401 0046 0174 4364 62"));

        assertFalse(ibanValidatorDE.isValid("DE1723456780123456789"));
        assertFalse(ibanValidatorDE.isValid("DE74 44010046 01744-36 462"));
        assertFalse(ibanValidatorDE.isValid("de07123412341234123412"));
        assertFalse(ibanValidatorDE.isValid("DE98 7484 3087 9903 6894 16"));
        assertFalse(ibanValidatorDE.isValid("DE08123412341234123412"));
        assertFalse(ibanValidatorDE.isValid("DE241234567801234567B9"));
        assertFalse(ibanValidatorDE.isValid("GB061234567801234567B9"));
    }
}
