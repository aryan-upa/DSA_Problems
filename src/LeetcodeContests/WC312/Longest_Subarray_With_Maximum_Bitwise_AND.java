package LeetcodeContests.WC312;

public class Longest_Subarray_With_Maximum_Bitwise_AND {
	public int longestSubarray(int[] arr) {
		int maxAnd = Integer.MIN_VALUE;

		for (int i : arr)
			maxAnd = Math.max(maxAnd, i);

		int si = 0;
		int ei = 0;

		int currAnd = arr[0];
		int len = 1;

		while (ei < arr.length) {
			currAnd = currAnd & arr[ei];

			if (currAnd < maxAnd) {
				si = ei;
				currAnd = arr[si];
			}

			len = Math.max(len, ei - si + 1);
			ei ++;
		}

		return len;
	}
}
