package org.example;

public class Makes10 {
    public boolean makes10(int a, int b) {
        // Check if either a or b is 10
        // OR if their sum is 10
        // We can combine all these conditions using the OR operator (||)

        return (a == 10) || (b == 10) || (a + b == 10);

        // This will return true if:
        // - a is 10, OR
        // - b is 10, OR
        // - the sum of a and b is 10
        // It will return false if none of these conditions are met
    }
}