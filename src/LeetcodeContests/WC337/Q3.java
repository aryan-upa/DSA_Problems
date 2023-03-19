package LeetcodeContests.WC337;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.lang.*;

public class Q3 {
	public int beautifulSubsets(int[] nums, int k) {
		return generateSubsetsAndCheck(nums, k, new ArrayList<>(), 0);
	}

	public int generateSubsetsAndCheck (int[] nums, int k, ArrayList<Integer> prev, int idx) {
		if (idx == nums.length)
			return isValidSubarray(prev, k) ? 1 : 0;

		int without = generateSubsetsAndCheck(nums, k, prev, idx + 1);
		prev.add(nums[idx]);
		int with = generateSubsetsAndCheck(nums, k, prev, idx + 1);
		prev.remove(prev.size() - 1);

		return with + without;
	}

	public boolean isValidSubarray (ArrayList<Integer> prev, int k) {
		if (prev.size() == 0)
			return false;

		int n = prev.size();
		for (int i = 0; i < n-1; i ++)
			for (int j = i + 1; j < n; j ++) {
				if (Math.abs(prev.get(i) - prev.get(j)) == k)
					return false;
			}

		return true;
	}
}
