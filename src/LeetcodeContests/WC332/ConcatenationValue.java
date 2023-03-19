package LeetcodeContests.WC332;

public class ConcatenationValue {
    public long findTheArrayConcVal(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        long concatValue = 0;
        while (e > s) {
            long num = Long.parseLong(nums[s] + "" + nums[e]);
            s ++;
            e --;
            concatValue += num;
        }

        if (e == s)
            concatValue += nums[e];

        return concatValue;
    }
}
