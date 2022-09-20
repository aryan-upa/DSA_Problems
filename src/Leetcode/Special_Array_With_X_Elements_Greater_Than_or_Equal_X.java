package Leetcode;

public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X {

	public int specialArray(int[] nums) {
		int l = 0;
		int h = Integer.MAX_VALUE;

		while (l <= h) {
			int mid = l + (h - l) / 2;

			int res = checkSpeciality(nums, mid);

			if (res == 0)
				return mid;

			if (res > 0)
				l = mid + 1;

			else
				h = mid - 1;
		}

		return -1;
	}

	public int checkSpeciality(int[] nums, int n) {
		int count = 0;

		for (int i : nums) {
			if (i >= n)
				count ++;
		}

		return count - n;
	}

}
