package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class QuickSortTest {

    private QuickSort quickSort;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        quickSort = new QuickSort();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testQuickSortWithUnsortedArray() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{11, 12, 22, 25, 34, 64, 90}, arr);
    }

    @Test
    void testQuickSortWithSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testQuickSortWithReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testQuickSortWithDuplicateElements() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9}, arr);
    }

    @Test
    void testQuickSortWithEmptyArray() {
        int[] arr = {};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testQuickSortWithSingleElementArray() {
        int[] arr = {1};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    void testMain() {
        QuickSort.main(new String[]{});
        String expectedOutput = "Example 1: 1 3 4 7 9 " + System.lineSeparator() +
                "Example 2: 1 1 2 3 4 6 7 9 10 " + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testPartition() {
        int[] arr = {4, 1, 3, 9, 7};
        int partitionIndex = QuickSort.partition(arr, 0, arr.length - 1);
        assertTrue(partitionIndex >= 0 && partitionIndex < arr.length);
        for (int i = 0; i < partitionIndex; i++) {
            assertTrue(arr[i] <= arr[partitionIndex]);
        }
        for (int i = partitionIndex + 1; i < arr.length; i++) {
            assertTrue(arr[i] >= arr[partitionIndex]);
        }
    }
}