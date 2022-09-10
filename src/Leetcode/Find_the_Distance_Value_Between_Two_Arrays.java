package Leetcode;

import java.util.Arrays;
import java.lang.*;

public class Find_the_Distance_Value_Between_Two_Arrays {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int j : arr1)
            if (isDistanced(j, arr2, d))
                count++;

        return count;
    }

    public boolean isDistanced(int num, int[] arr, int d) {
        int l = 0;
        int h = arr.length - 1;

        int mid;
        while (l <= h) {
            mid = l + (h - l) / 2;

            if (Math.abs(num - arr[mid]) <= d)
                return false;

            if (arr[mid] > num)
                h = mid - 1;
            else
                l = mid + 1;
        }

        return true;
    }

}
