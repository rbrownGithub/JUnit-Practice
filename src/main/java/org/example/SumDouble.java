package org.example;

public class SumDouble {
    public int sumDouble(int a, int b) {
        long sum = (long)a + (long)b;
        if (a == b) {
            sum *= 2;
        }
        if (sum > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (sum < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int)sum;
        }
    }
}