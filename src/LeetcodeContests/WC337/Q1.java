package LeetcodeContests.WC337;

public class Q1 {
    public int[] evenOddBit(int n) {
        char[] arrayRep = Integer.toString(n, 2).toCharArray();

        int idx = arrayRep.length - 1;
        int[] res = new int[2];

        for (char c : arrayRep) {
            if (c == '1')
                res[idx % 2] += 1;
            idx -= 1;
        }

        return res;
    }
}
