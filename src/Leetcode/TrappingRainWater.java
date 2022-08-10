package Leetcode;

public class TrappingRainWater {
    // Time: 2ms
    // though Math.max method call is more secure and general design of the system requires to separate out program in
    // methods and their calls, but it reduces the performance of the system. In general Program written in a single
    // block outperforms program written with modularity.
    public int trap(int[] height) {
        int water = 0, len = height.length;

        int[] lMax, rMax;
        lMax = new int[len];
        rMax = new int[len];

        lMax[0] = height[0];
        for(int i = 1; i < len; i++)
            lMax[i] = lMax[i-1] > height[i] ? lMax[i-1] : height[i];

        rMax[len - 1] = height[len - 1];
        for(int i = len-2; i >= 0; i--)
            rMax[i] = rMax[i+1] > height[i] ? rMax[i+1] : height[i];

        for(int i = 1; i < len-1; i++)
            water += (rMax[i] < lMax[i] ? rMax[i] : lMax[i]) - height[i];

        return water;
    }

}
