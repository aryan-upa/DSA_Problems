package Leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strings) {
        int minLen = Integer.MAX_VALUE;
        for (String str : strings) {
            int lenTemp = str.length();
            if (lenTemp < minLen)
                minLen = lenTemp;
        }

        boolean isBroken = false;
        int subStringLen = 0;
        for (int i = 0; i < minLen; i++) {
            char val = strings[0].charAt(i);
            for (String s : strings) {
                if (s.charAt(i) != val) {
                    isBroken = true;
                    break;
                }
            }
            if(isBroken)
                break;
            subStringLen++;
        }

        return strings[0].substring(0, subStringLen);
    }
}
