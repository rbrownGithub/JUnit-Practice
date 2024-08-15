package org.example;

public class QuickSort {

    // Method to perform the partitioning
    static int partition(int[] arr, int low, int high) {
        // Pivot is the last element
        int pivot = arr[high];
        int i = low - 1;  // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is less than or equal to pivot
            if (arr[j] <= pivot) {
                i++;  // Increment index of smaller element
                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap the pivot element with the element at (i + 1)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return the partitioning index
    }

    // Method to perform quick sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int pi = partition(arr, low, high);

            // Recursively sort the sub-arrays
            quickSort(arr, low, pi - 1);  // Before pivot
            quickSort(arr, pi + 1, high); // After pivot
        }
    }

    // Main method to test the quickSort function
    public static void main(String[] args) {
        int[] arr1 = { 4, 1, 3, 9, 7 };
        int[] arr2 = { 2, 1, 6, 10, 4, 1, 3, 9, 7 };

        quickSort(arr1, 0, arr1.length - 1);
        quickSort(arr2, 0, arr2.length - 1);

        // Output sorted arrays
        System.out.print("Example 1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Example 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}