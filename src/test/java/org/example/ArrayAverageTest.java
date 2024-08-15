package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayAverageTest {

    @Test
    void testCalculateAverageNormalCase() {
        int[] numbers = {1, 2, 3, 4, 5};
        double expected = 3.0;
        assertEquals(expected, ArrayAverage.calculateAverage(numbers), 0.0001);
    }

    @Test
    void testCalculateAverageWithNegativeNumbers() {
        int[] numbers = {-1, -2, -3, -4, -5};
        double expected = -3.0;
        assertEquals(expected, ArrayAverage.calculateAverage(numbers), 0.0001);
    }

    @Test
    void testCalculateAverageWithMixedNumbers() {
        int[] numbers = {-2, 0, 2, 4, -4};
        double expected = 0.0;
        assertEquals(expected, ArrayAverage.calculateAverage(numbers), 0.0001);
    }

    @Test
    void testCalculateAverageWithSingleElement() {
        int[] numbers = {5};
        double expected = 5.0;
        assertEquals(expected, ArrayAverage.calculateAverage(numbers), 0.0001);
    }

    @Test
    void testCalculateAverageWithEmptyArray() {
        int[] numbers = {};
        assertThrows(ArithmeticException.class, () -> ArrayAverage.calculateAverage(numbers));
    }

    @Test
    void testCalculateAverageWithNullArray() {
        assertThrows(IllegalArgumentException.class, () -> ArrayAverage.calculateAverage(null));
    }

    @Test
    void testCalculateAverageWithLargeNumbers() {
        int[] numbers = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        double expected = (double) Integer.MAX_VALUE;
        assertEquals(expected, ArrayAverage.calculateAverage(numbers), 0.0001);
    }
}