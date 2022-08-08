package Leetcode;

import java.util.*;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxEle = candies[0];
        for (int candy : candies)
            maxEle = maxEle > candy ? maxEle : candy;

        Boolean[] list = new Boolean[candies.length];
        int shouldBeGreaterThan = maxEle - extraCandies;

        for(int i = 0; i < candies.length; i++)
            list[i] = candies[i] >= shouldBeGreaterThan;

        return Arrays.asList(list);
    }
}
