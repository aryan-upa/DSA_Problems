package Leetcode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int num1 = 0;
        int num2 = 0;

        for(int i = 0; i < nums.length - 1; i++)
            for (int j = i+1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    num1 = nums[i];
                    num2 = nums[j];
                    break;
                }

        int[] res = new int[2];
        res[0] = num1;
        res[1] = num2;
        return res;
    }
}
