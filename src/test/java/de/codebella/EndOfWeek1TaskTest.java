package de.codebella;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndOfWeek1TaskTest {
    @Test
    void passwordShouldBeFine() {
        assertEquals("Password accepted.", EndOfWeek1Task.pwdChecker("jkl9djsu43KK$", 5));
    }

    @Test
    void emptyShouldGiveAnError() {
        assertEquals("Error, password cannot be empty.", EndOfWeek1Task.pwdChecker("", 5));
    }

    @Test
    void tooShortShouldGiveAnError() {
        assertEquals("Error, password too short.", EndOfWeek1Task.pwdChecker("t$8T", 5));
    }

    @Test
    void noNumbersShouldGiveAnError() {
        assertEquals("Error, password must contain a number.", EndOfWeek1Task.pwdChecker("testeR$", 5));
    }

    @Test
    void noLowercaseLetterShouldGiveAnError() {
        assertEquals("Error, password must contain a lowercase letter.", EndOfWeek1Task.pwdChecker("6789278389890$A", 5));
    }

    @Test
    void noUppercaseLetterShouldGiveAnError() {
        assertEquals("Error, password must contain an uppercase letter.", EndOfWeek1Task.pwdChecker("tester67896798$", 5));
    }
}