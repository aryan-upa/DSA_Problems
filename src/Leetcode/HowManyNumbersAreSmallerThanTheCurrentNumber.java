package Leetcode;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int MaxNumElement = 101;
        int[] count = new int[MaxNumElement];
        for (int num : nums) count[num]++;

        int currSmall = 0;
        for(int i = 0; i < MaxNumElement; i++) {
            int temp = count[i];
            count[i] = currSmall;
            currSmall += temp;
        }

        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            res[i] = count[nums[i]];

        return res;
    }

}
