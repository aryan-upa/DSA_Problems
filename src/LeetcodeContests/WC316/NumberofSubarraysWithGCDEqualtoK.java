// wrong, not working solution.

package LeetcodeContests.WC316;

public class NumberofSubarraysWithGCDEqualtoK {
	public int subarrayGCD(int[] nums, int k) {
		int l = 0;
		int h = 0;

		int count = 0;
		while (h < nums.length) {
			while (l <= h) {
				if (getGCD(nums, h, l) == k) {
					count += 1;
					break;
				}
				else
					l++;
			}

			h ++;
		}

		return count;
	}

	public int getGCD(int[] nums, int l, int h) {
		if (h - l < 1) {
			return nums[l];
		}

		int gcd = gcd(nums[l], nums[l + 1]);

		for (int i = l + 2; i <= h; i ++) {
			gcd = gcd(gcd, nums[i]);
		}

		return gcd;
	}

	public int gcd(int a, int b) { // Euclidean Approach, but recursive.
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

}
