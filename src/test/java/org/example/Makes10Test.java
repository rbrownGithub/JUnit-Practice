package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Makes10Test {

    private Makes10 makes10;

    @BeforeEach
    void setUp() {
        makes10 = new Makes10();
    }

    @Test
    void testBothNumbersAre10() {
        assertTrue(makes10.makes10(10, 10), "Both numbers are 10");
    }

    @Test
    void testFirstNumberIs10() {
        assertTrue(makes10.makes10(10, 5), "First number is 10");
    }

    @Test
    void testSecondNumberIs10() {
        assertTrue(makes10.makes10(5, 10), "Second number is 10");
    }

    @Test
    void testSumIs10() {
        assertTrue(makes10.makes10(7, 3), "Sum of numbers is 10");
    }

    @Test
    void testNeitherNumberIs10AndSumIsNot10() {
        assertFalse(makes10.makes10(8, 3), "Neither number is 10 and sum is not 10");
    }

    @Test
    void testWithZero() {
        assertTrue(makes10.makes10(10, 0), "One number is 10, other is 0");
    }

    @Test
    void testWithNegativeNumbers() {
        assertTrue(makes10.makes10(-5, 15), "Sum is 10 with a negative number");
    }

    @Test
    void testWithLargeNumbers() {
        assertFalse(makes10.makes10(100, 9), "Large number that is not 10");
    }
}