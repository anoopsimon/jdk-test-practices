package org.example;
import java.util.*;

class A01 {
    //only one example workd
    public static int solution(int[] A) {
        int maxVal = A.length;
        int totalMovesNeeded = 0;

        for (int i = 0; i < maxVal;) {
            int X = A[i];
            int nuberoftimes = 0;

            for (; i < maxVal && A[i] == X; i++) {
                nuberoftimes++;
            }

            totalMovesNeeded += Math.abs(X - nuberoftimes);
        }

        return totalMovesNeeded;
    }



    public static void main(String[] args) {
        A01 solution = new A01();

        int[] example1 = {1, 1, 3, 4, 4, 4};
        System.out.println("Example 1 Result: " + solution.solution(example1) + " (Expected: 3)");

        int[] example2 = {1, 2, 2, 2, 5, 5, 5, 8};
        System.out.println("Example 2 Result: " + solution.solution(example2) + " (Expected: 4)");

        int[] example3 = {1, 1, 1, 1, 3, 3, 4, 4, 4, 4, 4};
        System.out.println("Example 3 Result: " + solution.solution(example3) + " (Expected: 5)");

        int[] example4 = {10, 10, 10};
        System.out.println("Example 4 Result: " + solution.solution(example4) + " (Expected: 3)");
    }
}

