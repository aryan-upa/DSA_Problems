package Leetcode;

import java.util.ArrayList;

public class CreateTargetArrayInTheGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>(nums.length);

        for(int i = 0; i < nums.length; i++)
            list.add(index[i], nums[i]);

        int[] res = new int[list.size()];

        for(int i = 0; i < nums.length; i++)
            res[i] = list.get(i);

        return res;
    }

}
