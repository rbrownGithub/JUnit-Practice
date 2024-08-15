package org.example;
public class BubbleSort {

    // Function to perform bubble sort
    public static void bubblesort(int[] arr, int N) {
        // Outer loop for each pass
        for (int i = 0; i < N - 1; i++) {
            // Inner loop for comparing adjacent elements
            boolean swapped = false;
            for (int j = 0; j < N - 1 - i; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, break out of the loop early
            if (!swapped) {
                break;
            }
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to the next line after printing all elements
    }

    // Main method to test the bubblesort function
    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {4, 1, 3, 9, 7};
        int N1 = arr1.length;
        System.out.println("Example 1:");
        printArray(arr1);
        bubblesort(arr1, N1);
        System.out.println("Sorted Array 1:");
        printArray(arr1);

        // Test Case 2
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int N2 = arr2.length;
        System.out.println("Example 2:");
        printArray(arr2);
        bubblesort(arr2, N2);
        System.out.println("Sorted Array 2:");
        printArray(arr2);
    }
}
