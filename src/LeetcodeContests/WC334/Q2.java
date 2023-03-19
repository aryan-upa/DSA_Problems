package LeetcodeContests.WC334;

import java.util.Arrays;

public class Q2 {
	public int[] divisibilityArray(String word, int m) {
		int[] res = new int[word.length()];

		if (m == 1) {
			Arrays.fill(res, 0, res.length, 1);
			return res;
		}

		char[] digits = word.toCharArray();
		int ptr = 0;

		while (ptr < digits.length) {

		}

		return res;
	}
}
