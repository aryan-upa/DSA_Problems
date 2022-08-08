package Leetcode;

import java.util.HashMap;

public class NumberOfGoodPairs {

    // Method 1 : Time : 2ms
    public int calculatePairs(int times) {
        int prevInd = 1;
        int prevCount = 0;
        int currCount = 0;

        while(prevInd < times) {
            currCount = prevCount + prevInd;
            prevCount = currCount;
            prevInd += 1;
        }

        return currCount;
    }

    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            if (map.containsKey(a))
                map.put(a, map.get(a) + 1);
            else
                map.put(a, 1);
        }

        Integer[] keys = map.keySet().toArray(new Integer[0]);
        int totalPairs = 0;
        for(int key : keys)
            totalPairs += calculatePairs(map.get(key));

        return totalPairs;
    }

    // Method 2 : Time : 0ms

    public int numIdenticalPairs2(int[] nums) {
        int[] arr = new int[101]; // as permissible range of integers is in b/w 1 <= n <= 100 .
        for(int num : nums)
            arr[num]++;

        int totalPairs = 0;
        for(int num : arr)
            totalPairs += calculatePairs(num);

        return totalPairs;
    }

    public static void main(String[] args) {
        System.out.println(new NumberOfGoodPairs().numIdenticalPairs(new int[]{1, 2, 2}));
    }

}
