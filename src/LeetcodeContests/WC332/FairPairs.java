package LeetcodeContests.WC332;

import java.util.Arrays;

public class FairPairs {
    public static void main(String[] args) {
        System.out.println(countFairPairs(new int[]{1,7,9,2,5}, 11, 11));
    }

    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        int s = 0;
        int min = s + 1;
        int max = nums.length - 1;

        int count = 0;

        while (min <= max && s < min) {
            while (min < nums.length && nums[s] + nums[min] < lower)
                min += 1;

            while (max > 0 && nums[s] + nums[max] > upper)
                max -= 1;

            if (max < min)
                break;

            if (nums[s] + nums[min] >= lower && nums[s] + nums[max] <= upper)
                count += (max - min + 1);

            s += 1;
        }

        return count;
    }
}
