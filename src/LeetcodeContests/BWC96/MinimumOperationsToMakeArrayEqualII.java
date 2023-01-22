package LeetcodeContests.BWC96;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class MinimumOperationsToMakeArrayEqualII {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        long[] diff = new long[nums1.length];

        for (int i = 0; i < diff.length; i ++) {
            diff[i] = nums1[i] - nums2[i];
            if (diff[i] != 0 && k == 0)
                return -1;
            if (diff[i] == 0)
                continue;
            if (diff[i] % k != 0)
                return -1;
        }

        long diffSum = 0;
        long posDiff = 0;
        for (long val : diff) {
            diffSum += val;
            posDiff += Math.max(val, 0);
        }

        if (diffSum != 0)
            return -1;

        if (posDiff == 0)
            return 0;

        if (k == 0)
            return -1;

        return posDiff / k;
    }
}
