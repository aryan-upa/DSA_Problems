package Leetcode;

public class Find_Smallest_Letter_Greater_Than_Target {
    public char nextGreatestLetter(char[] ls, char target) {
        if (ls.length == 1)
            return ls[0];

        if (ls[ls.length - 1] <= target || ls[0] > target)
            return ls[0];

        int l = 0;
        int h = ls.length - 1;

        char answer = 'a';
        while (l <= h) {
            int mid = l + (h-l)/2;

            if (ls[mid] > target) {
                answer = ls[mid];
                h = mid - 1;
            }
            else
                l = mid + 1;
        }

        return answer;
    }
}
