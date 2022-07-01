package Leetcode;

import java.util.Arrays;

public class medianOfTwoSortedArrays {
    // BruteForce Solution

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;
        int[] nums = new int[totalLen];
        int i;
        for(i=0; i<totalLen; i++) {
            if (i < nums1.length)
                nums[i] = nums1[i];
            else
                nums[i] = nums2[i - nums1.length];
        }
        Arrays.sort(nums);
        double mod;
        if (totalLen % 2 == 0) {
            mod = (double)(nums[totalLen/2 - 1] + nums[totalLen/2]) / 2;
        }
        else {
            mod = nums[totalLen/2];
        }
        return mod;
    }
}
