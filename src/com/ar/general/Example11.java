package com.ar.general;

public class Example11 {
    int solution(int[] A) {
        // Initialize ans with the first element of the array
        int ans = A[0];
        // Loop through the array starting from the second element
        for (int i = 1; i < A.length; i++) {
            // Update ans if the current element is smaller
            if (A[i] < ans) {
                ans = A[i];
            }
        }
        // Return the smallest element found
        return ans;
    }

public static void main(String[] args) {
    Example11 sol = new Example11();

    // Test cases
    int[] testArray1 = {-1, 1, -2, 2};
    System.out.println("Smallest in testArray1: " + sol.solution(testArray1)); // Should print -2

    int[] testArray2 = {3, 4, 2, 5, 1};
    System.out.println("Smallest in testArray2: " + sol.solution(testArray2)); // Should print 1

    int[] testArray3 = {-5, -1, -6, -2};
    System.out.println("Smallest in testArray3: " + sol.solution(testArray3)); // Should print -6

    int[] testArray4 = {1000, -1000, 500, 0};
    System.out.println("Smallest in testArray4: " + sol.solution(testArray4)); // Should print -1000
}
}
