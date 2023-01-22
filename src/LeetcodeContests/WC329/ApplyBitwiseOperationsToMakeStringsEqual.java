package LeetcodeContests.WC329;

public class ApplyBitwiseOperationsToMakeStringsEqual {
	public boolean makeStringsEqual(String s, String target) {
		if (s.equals(target))
				return true;

		int[] occ1 = new int[2];
		int[] occ2 = new int[2];

		for (char c : s.toCharArray())
			occ1[c - '0'] += 1;

		for (char c : target.toCharArray())
			occ2[c - '0'] += 1;

		if (occ1[1] > 0 && occ2[0] == target.length())
			return false;

		if (occ1[0] == s.length() && occ2[1] > 0)
			return false;

		if ((occ1[1] == s.length() || occ1[0] == s.length()) && (occ2[0] == s.length() || occ2[1] == s.length()))
			return false;

		return true;
	}
}
