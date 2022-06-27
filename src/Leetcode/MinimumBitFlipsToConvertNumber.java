package Leetcode;

public class MinimumBitFlipsToConvertNumber {
    public int minBitFlips(int start, int goal) {
        int max = Math.max(start, goal);
        int steps = 0;
        while(max > 0) {
            steps += ((start ^ goal) & 1);
            start >>= 1;
            goal >>= 1;
            max >>= 1;
        }
        return steps;
    }
}
