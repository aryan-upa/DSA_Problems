package LeetcodeContests.WC334;

public class Q1 {
	public int[] leftRigthDifference(int[] nums) {
		int[] rightSum = new int[nums.length];
		int rSum = 0;
		for (int i = nums.length - 1; i >= 0; i --) {
			rightSum[i] = rSum;
			rSum += nums[i];
		}

		int lSum = 0;
		for (int i = 0; i < nums.length; i++) {
			int cVal = Math.abs(lSum - rightSum[i]);
			lSum += nums[i];
			nums[i] = cVal;
		}

		return nums;
	}
}
