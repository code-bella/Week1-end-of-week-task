package de.codebella;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndOfWeek1TaskTest {
    @Test
    void emptyShouldGiveAnError() {
        assertEquals("Error, password cannot be empty.", EndOfWeek1Task.pwdChecker(""));
    }

    @Test
    void tooShortShouldGiveAnError() {
        assertEquals("Error, password too short.", EndOfWeek1Task.pwdChecker("te8t"));
    }

    @Test
    void noNumbersShouldGiveAnError() {
        assertEquals("Error, password must contain numbers.", EndOfWeek1Task.pwdChecker("tester"));
    }
}