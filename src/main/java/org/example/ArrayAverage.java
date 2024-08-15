package org.example;

public class ArrayAverage {
    /**
     * Calculates the average of an array of integers.
     * @param numbers The input array of integers.
     * @return The average of the numbers in the array as a double.
     * @throws IllegalArgumentException if the input array is null.
     * @throws ArithmeticException if the input array is empty.
     */
    public static double calculateAverage(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        if (numbers.length == 0) {
            throw new ArithmeticException("Cannot calculate average of an empty array");
        }

        long sum = 0; // Use long to prevent integer overflow
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        double average = calculateAverage(testArray);
        System.out.println("Average: " + average);

        int[] largeArray = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        double largeAverage = calculateAverage(largeArray);
        System.out.println("Large Average: " + largeAverage);
    }
}