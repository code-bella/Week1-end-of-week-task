package de.codexbella;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndOfWeek1TaskTest {
    @Test
    void passwordsShouldBeFine() {
        assertArrayEquals(new String[] {"Password accepted.", "Password accepted."}, EndOfWeek1Task.pwdChecker(new String[] {"jkl9djsu43KK$", "jkl9djsu43KK+"}, 5));
    }
    @Test
    void emptyShouldGiveAnError() {
        assertArrayEquals(new String[] {"Error, password cannot be empty.", "Error, password cannot be empty."}, EndOfWeek1Task.pwdChecker(new String[] {"", ""}, 5));
    }
    @Test
    void tooShortShouldGiveAnError() {
        assertArrayEquals(new String[] {"Error, password too short.", "Error, password too short."}, EndOfWeek1Task.pwdChecker(new String[] {"t$8T", "t+8T"}, 5));
    }
    @Test
    void noNumbersShouldGiveAnError() {
        assertArrayEquals(new String[] {"Error, password must contain a number.", "Error, password must contain a number."}, EndOfWeek1Task.pwdChecker(new String[] {"testeR$", "testeR+"}, 5));
    }
    @Test
    void noLowercaseLetterShouldGiveAnError() {
        assertArrayEquals(new String[] {"Error, password must contain a lowercase letter.", "Error, password must contain a lowercase letter."}, EndOfWeek1Task.pwdChecker(new String[] {"6789278389890$A", "6789278389890+A"}, 5));
    }
    @Test
    void noUppercaseLetterShouldGiveAnError() {
        assertArrayEquals(new String[] {"Error, password must contain an uppercase letter.", "Error, password must contain an uppercase letter."}, EndOfWeek1Task.pwdChecker(new String[] {"tester67896798$", "tester67896798+"}, 5));
    }
    @Test
    void noUppercaseAndNoLowercaseLetterShouldGiveAnError() {
        assertArrayEquals(new String[] {"Error, password must contain a lowercase letter.", "Error, password must contain an uppercase letter."}, EndOfWeek1Task.pwdChecker(new String[] {"TESTER67896798$", "tester67896798+"}, 5));
    }
}