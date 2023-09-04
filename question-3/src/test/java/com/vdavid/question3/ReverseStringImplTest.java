package com.vdavid.question3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringImplTest {

    private ReverseStringImpl underTest;

    @BeforeEach
    public void setUp() {
        underTest = new ReverseStringImpl();
    }

    @Test
    void shouldReturnNullWhenInputIsNull() {
        // when

        // then
        final String result = underTest.reverseString(null);

        // give
        assertNull(result);
    }

    @Test
    void shouldReturnEmptyWhenInputIsEmpty() {
        // when

        // then
        final String result = underTest.reverseString("");

        // give
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnSameWhenLengthIsOne() {
        // when
        String expected = "a";

        // then
        final String result = underTest.reverseString("a");

        // give
        assertEquals(expected, result);
    }

    @Test
    void shouldReverseStringWhenLengthIsTwo() {
        // when
        String expected = "ba";

        // then
        final String result = underTest.reverseString("ab");

        // give
        assertEquals(expected, result);
    }

    @Test
    void shouldReverseStringWhenLengthIsGreaterThenTwo() {
        // when
        String expected = "erutan";

        // then
        final String result = underTest.reverseString("nature");

        // give
        assertEquals(expected, result);
    }

    @Test
    void shouldReverseStringWhenInputHasDuplicates() {
        // when
        String expected = "yppah";

        // then
        final String result = underTest.reverseString("happy");

        // give
        assertEquals(expected, result);
    }
}

