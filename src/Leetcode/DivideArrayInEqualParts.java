package Leetcode;

import java.util.Arrays;

public class DivideArrayInEqualParts {
    public boolean divideArray(int[] nums) {
        boolean[] isPairPresent = new boolean[501];
        Arrays.fill(isPairPresent, true);
        for(int num : nums)
            isPairPresent[num] = !isPairPresent[num];

        for(boolean bool : isPairPresent)
            if (!bool)
                return false;
        return true;
    }
}
