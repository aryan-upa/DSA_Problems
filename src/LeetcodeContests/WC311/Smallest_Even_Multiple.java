package LeetcodeContests.WC311;

public class Smallest_Even_Multiple {

	public static void main(String[] args) {
		System.out.println(new Smallest_Even_Multiple().smallestEvenMultiple(44));
	}

	public int smallestEvenMultiple(int n) {
		if (n % 2 == 0)
			return n;
		else
			return n * 2;
	}
}
