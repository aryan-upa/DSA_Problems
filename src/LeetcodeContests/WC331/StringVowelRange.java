package LeetcodeContests.WC331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class StringVowelRange {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] vowelStringCount = new int[words.length + 1];
        int count = 0;
        for (int i = 0; i < words.length; i ++) {
            if (isValidString(words[i]))
                count += 1;
            vowelStringCount[i + 1] = count;
        }

        int[] result = new int[queries.length];
        int i = 0;

        for (int[] range : queries) {
            result[i] = vowelStringCount[range[1] + 1] - vowelStringCount[range[0]];
            i += 1;
        }

        return result;
    }

    public boolean isValidString (String str) {
        String vowels = "aeiou";
        return vowels.indexOf(str.charAt(0)) >= 0 && vowels.indexOf(str.charAt(str.length() - 1)) >= 0;
    }
}
