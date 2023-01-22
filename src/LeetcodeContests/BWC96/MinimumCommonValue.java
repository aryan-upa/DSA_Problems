package LeetcodeContests.BWC96;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class MinimumCommonValue {
	public int getCommon(int[] nums1, int[] nums2) {
		int i = 0;
		int j = 0;

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j])
				return nums1[i];

			if (nums1[i] > nums2[j])
				j ++;
			else
				i ++;
		}

		return -1;
	}
}
