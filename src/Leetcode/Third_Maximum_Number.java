package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Third_Maximum_Number {

    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] sorted3 = new int[3];
        Arrays.fill(sorted3, Integer.MIN_VALUE);

        for (int num : nums) {
            insertInSorted(sorted3, num);
            set.add(num);
        }

        return set.size() <= 2 ? sorted3[0] : sorted3[2];
    }

    public void insertInSorted(int[] arr, int num) {
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == num) break;
            if (arr[i] < num) {
                for (int j = arr.length - 1 ; j > i; j --) {
                    arr[j] = arr[j - 1];
                }
                arr[i] = num;
                break;
            }
        }
    }

}
