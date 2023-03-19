package LeetcodeContests.WC333;

import java.util.ArrayList;

public class Q1 {
	public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
		int p1 = 0;
		int p2 = 0;

		ArrayList<int[]> list = new ArrayList<>();
		while (p1 < nums1.length && p2 < nums2.length) {
			if (nums1[p1][0] < nums2[p2][0]) {
				list.add(nums1[p1]);
				p1 += 1;
			} else if (nums1[p1][0] > nums2[p2][0]) {
				list.add(nums2[p2]);
				p2 += 1;
			} else {
				list.add(new int[]{nums1[p1][0], nums1[p1][1] + nums2[p2][1]});
				p1 += 1;
				p2 += 1;
			}
		}

		while (p1 < nums1.length)
			list.add(nums1[p1 ++]);

		while (p2 < nums2.length)
			list.add(nums2[p2 ++]);

		int[][] res = new int[list.size()][2];

		int i = 0;
		for (int[] v : list)
			res[i++] = v;

		return res;
	}
}
