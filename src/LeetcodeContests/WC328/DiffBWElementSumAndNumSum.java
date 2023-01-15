package LeetcodeContests.WC328;

public class DiffBWElementSumAndNumSum {
	public int differenceOfSum(int[] nums) {
		int numSum = 0;
		int digSum = 0;

		for (int val : nums) {
			numSum += val;
			digSum += dig(val);
		}

		return Math.abs(numSum - digSum);
	}

	public int dig (int val) {
		char[] c = String.valueOf(val).toCharArray();
		int sum = 0;
		for (char a : c) {
			sum += (int) (a - '0');
		}

		return sum;
	}
}
