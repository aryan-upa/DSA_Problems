package LeetcodeContests.WC310;

import java.util.Arrays;

public class OptimalPartitioOfString {
    public int partitionString(String s) {
        int[] alphabets = new int[26];
        int ans = 1;
        alphabets[s.charAt(0) - 97]++;
        for (int i = 1; i < s.length(); i ++) {
            if (alphabets[s.charAt(i) - 97] >= 1) {
                ans++;
                Arrays.fill(alphabets, 0);
            }
            alphabets[s.charAt(i) - 97] ++;
        }

        return ans;
    }
}
