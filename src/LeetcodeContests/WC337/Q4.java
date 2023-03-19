package LeetcodeContests.WC337;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class Q4 {
	public int findSmallestInteger(int[] nums, int value) {
		for (int i = 0; i < nums.length; i ++) {
			nums[i] = nums[i] < 0 ? nums[i] + ((-nums[i] / value) + 1) * value : nums[i];
			nums[i] = nums[i] % value;
		}

		int[] modFreq = new int[value];
		for (int num : nums) modFreq[num] += 1;

		int misVal = 0;
		int idx = 0;
		while (modFreq[idx] != 0) {
			modFreq[idx] -= 1;
			idx += 1;

			misVal += 1;

			if (idx == modFreq.length)
				idx = 0;
		}

		return misVal;
	}
}
