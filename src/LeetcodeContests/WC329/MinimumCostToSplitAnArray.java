package LeetcodeContests.WC329;

public class MinimumCostToSplitAnArray {
	static int maxCost;
	static int minCost;

	public static void main(String[] args) {
		System.out.println(new MinimumCostToSplitAnArray().minCost(new int[]{1, 1, 2, 3}, 2));
	}

	public int minCost(int[] nums, int k) {
		minCost = maxCost = nums.length * k;
		findMinCost(nums, k, 0, 0);
		return minCost;
	}

	public void findMinCost(int[] nums, int k, int index, int currCost) {
		if (currCost > minCost)
			return;

		if (index == nums.length) {
			minCost = currCost;
			return;
		}

		int[] localOcc = new int[nums.length];
		int cost = k;
		int len = 0;

		for (int i = index; i < nums.length; i ++) {
			len += 1;

			cost -= localOcc[nums[i]] == 1 ? 0 : localOcc[nums[i]];
			localOcc[nums[i]] += 1;

			if (localOcc[nums[i]] != 1)
				cost += localOcc[nums[i]];

			findMinCost(nums, k, i+1, currCost + cost);
		}
	}
}
