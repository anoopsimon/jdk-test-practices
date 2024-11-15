package org.example;

public class A03
{

    //Only failing Example 2. given A=[7,4,-2,4,-2,-9] the function should return 4. the longest switching slice is [4,-2,4,-2]
    //  becuuse this code gives 3 but all other examples worked
    public int solution(int[] array) {
        if (array.length == 1) return 1;

        int maxSwitchingSliceLength = 1;
        int currentSliceLength = 2;
        int evenPositionValue = array[0];
        int oddPositionValue = array[1];

        for (int index = 2; index < array.length; index++) {
            if ((index % 2 == 0 && array[index] == evenPositionValue) || (index % 2 == 1 && array[index] == oddPositionValue)) {
                currentSliceLength++;
            } else {
                maxSwitchingSliceLength = Math.max(maxSwitchingSliceLength, currentSliceLength);
                currentSliceLength = 2;
                evenPositionValue = array[index - 1];
                oddPositionValue = array[index];
            }

            if (index % 2 == 0) evenPositionValue = array[index];
            else oddPositionValue = array[index];
        }

        maxSwitchingSliceLength = Math.max(maxSwitchingSliceLength, currentSliceLength);
        return maxSwitchingSliceLength;
    }

}
