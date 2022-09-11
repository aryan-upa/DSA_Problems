package LeetcodeContests.WC310;

import java.util.HashMap;
import java.lang.*;

public class MostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int el : nums)
            if (el % 2 == 0) {
                if (map.containsKey(el))
                    map.put(el, map.get(el) + 1);
                else
                    map.putIfAbsent(el, 1);
            }

        int maxVal = 0, maxKey = -1;
        for (int val : map.keySet()) {
            if (maxVal < map.get(val)) {
                maxVal = map.get(val);
                maxKey = val;
            }
            else if (maxVal == map.get(val)) {
                maxKey = Math.min(maxKey, val);
            }
        }

        return maxKey;
    }
}
