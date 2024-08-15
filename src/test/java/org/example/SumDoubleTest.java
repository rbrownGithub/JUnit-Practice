package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumDoubleTest {

    private SumDouble sumDouble;

    @BeforeEach
    void setUp() {
        sumDouble = new SumDouble();
    }

    // ... other test methods ...

    @Test
    void testLargeNumbers() {
        assertEquals(2000000000, sumDouble.sumDouble(1000000000, 1000000000), "Sum of large numbers");
    }

    @Test
    void testVeryLargeNumbers() {
        assertEquals(Integer.MAX_VALUE, sumDouble.sumDouble(1500000000, 1500000000), "Sum of very large numbers should return MAX_VALUE");
    }

    @Test
    void testMaxIntValue() {
        assertEquals(Integer.MAX_VALUE, sumDouble.sumDouble(Integer.MAX_VALUE, 1), "Sum exceeding MAX_VALUE should return MAX_VALUE");
    }
}