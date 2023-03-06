package com.algorithm;

public class BinarySearch {
    static int binarySearch(String[] arr, String x) {
        int i = 0;
        int r = arr.length - 1;
        while (i <= r) {
            int m = 1 + (r - 1) / 2;
            int res = x.compareTo(arr[m]);
            // Check if x is present at mid
            if (res == 0)
                return m;
            // If x greater, ignore left half
            if (res > 0)
                i = m + 1;
                // If x is smaller, Ignore right half
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"Code", "Github", "the", "Pushed"};
        String x = "Github";
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println("Word not found");
        else
            System.out.println("Word found at " + "index" + " " + result);
    }
}

