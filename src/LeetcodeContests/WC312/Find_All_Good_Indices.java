// TLE
package LeetcodeContests.WC312;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Good_Indices {
	public List<Integer> goodIndices(int[] nums, int k) {
		List<Integer> res = new ArrayList<>();

		for (int i = k; i < nums.length - k; i ++) {
			if (nonIncreasing(nums, i - k, i-1) && nonDecreasing(nums, i + 1, i + k))
				res.add(i);
		}

		return res;
	}

	public boolean nonIncreasing(int[] arr, int si, int ei) {
		for (int i = si + 1; i <= ei; i ++)
			if (arr[i] > arr[i-1])
				return false;
		return true;
	}

	public boolean nonDecreasing(int[] arr, int si, int ei) {
		for (int i = si + 1; i <= ei; i ++)
			if (arr[i] < arr[i-1])
				return false;
		return true;
	}
}
