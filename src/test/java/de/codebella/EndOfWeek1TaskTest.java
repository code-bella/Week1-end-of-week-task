package de.codebella;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndOfWeek1TaskTest {
    @Test
    void passwordShouldBeFine() {
        assertEquals("Password accepted.", EndOfWeek1Task.pwdChecker("jkl9djsu43KK"));
    }

    @Test
    void emptyShouldGiveAnError() {
        assertEquals("Error, password cannot be empty.", EndOfWeek1Task.pwdChecker(""));
    }

    @Test
    void tooShortShouldGiveAnError() {
        assertEquals("Error, password too short.", EndOfWeek1Task.pwdChecker("te8T"));
    }

    @Test
    void noNumbersShouldGiveAnError() {
        assertEquals("Error, password must contain a number.", EndOfWeek1Task.pwdChecker("testeR"));
    }

    @Test
    void noLowercaseLetterShouldGiveAnError() {
        assertEquals("Error, password must contain a lowercase letter.", EndOfWeek1Task.pwdChecker("6789278389890"));
    }

    @Test
    void noUppercaseLetterShouldGiveAnError() {
        assertEquals("Error, password must contain an uppercase letter.", EndOfWeek1Task.pwdChecker("tester67896798"));
    }
}