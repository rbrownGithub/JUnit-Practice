package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BubbleSortTest {

    private String normalizeLineEndings(String s) {
        return s.replace("\r\n", "\n").replace('\r', '\n');
    }

    @Test
    void testBubblesort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.bubblesort(arr, arr.length);
        assertArrayEquals(new int[]{11, 12, 22, 25, 34, 64, 90}, arr);
    }

    @Test
    void testPrintArray() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        int[] arr = {1, 2, 3, 4, 5};
        BubbleSort.printArray(arr);

        String expectedOutput = "1 2 3 4 5 " + System.lineSeparator();
        assertEquals(normalizeLineEndings(expectedOutput),
                normalizeLineEndings(outContent.toString()));

        System.setOut(System.out); // Reset System.out to its original
    }

    @Test
    void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        BubbleSort.main(new String[]{});

        String expectedOutput =
                "Example 1:" + System.lineSeparator() +
                        "4 1 3 9 7 " + System.lineSeparator() +
                        "Sorted Array 1:" + System.lineSeparator() +
                        "1 3 4 7 9 " + System.lineSeparator() +
                        "Example 2:" + System.lineSeparator() +
                        "10 9 8 7 6 5 4 3 2 1 " + System.lineSeparator() +
                        "Sorted Array 2:" + System.lineSeparator() +
                        "1 2 3 4 5 6 7 8 9 10 " + System.lineSeparator();

        assertEquals(normalizeLineEndings(expectedOutput),
                normalizeLineEndings(outContent.toString()));

        System.setOut(System.out); // Reset System.out to its original
    }
}