package Leetcode;

public class RemoveDuplicatesFromSortedArray {

    // Runtime 1ms
    // Enhanced for is slower than normal for loop.
    public int removeDuplicates(int[] nums) {
        int pos = 0;

        for (int j = 0; j < nums.length; j++)
            if (nums[j] != nums[pos])
                nums[++pos] = nums[j];

        return pos+1;
    }

}
