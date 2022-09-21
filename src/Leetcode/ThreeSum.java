package Leetcode;

import java.util.*;

public class ThreeSum {
/*
Approach 1 :
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i ++) {
            for (int j = i + 1; j < nums.length - 1; j ++) {
                for (int k = j + 1; k < nums.length; k ++) {
                    if (nums[i] + nums[j] + nums[k] != 0)
                        continue;

                    int[] temp = new int[]{nums[i], nums[j], nums[k]};
                    Arrays.sort(temp);
                    var list = List.of(temp[0], temp[1], temp[2]);

                    if (set.contains(list))
                        continue;
                    set.add(list);
                    res.add(list);
                }
            }
        }

        return res;
    }
Problem : TLE

Approach 2 :
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> numsSet = new HashSet<>();
        HashSet<List<Integer>> doneSet = new HashSet<>();

        Arrays.sort(nums); // double pivot quicksort, TC: O(n * log n)

        for (int el : nums)
            numsSet.add(el);

        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j ++) {
                int req = -(nums[i]+nums[j]);
                if (!numsSet.contains(req))
                    continue;
                int[] temp = new int[]{nums[i], nums[j], req};
                Arrays.sort(temp);
                List<Integer> sum = List.of(temp[0], temp[1], temp[2]);
                if (doneSet.contains(sum))
                    continue;
                doneSet.add(sum);
                res.add(sum);
            }
        }

        return res;
    }

Problem : WA : We can not identify the index of k, as constraint specify that i != j, j != k and i != k.
    */

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    static public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        int target = 0;
        List<List<Integer>> res = new ArrayList<>();

        int i = 0;
        int n1;

        HashSet<List<Integer>> set = new HashSet<>();

        while (i < nums.length) {
            n1 = nums[i];

            int l = i + 1;
            int h = nums.length - 1;

            while (l < h) {

                int val = nums[i] + nums[l] + nums[h];

                if (val == target) {
                    List<Integer> sol = new ArrayList<>();

                    sol.add(n1);
                    sol.add(nums[l]);
                    sol.add(nums[h]);

                    if (!set.contains(sol)) {
                        set.add(sol);
                        res.add(sol);
                    }

                    l ++;
                    h --;
                }

                else if (val > target)
                    h --;

                else
                    l ++;
            }

            i ++;
        }

        return res;
    }

}

