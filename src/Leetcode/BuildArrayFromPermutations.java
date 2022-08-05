package Leetcode;

public class BuildArrayFromPermutations {

    public int[] buildArray(int[] arr) {
        int len = arr.length;
        int[] narr = new int[len];

        for(int i = 0; i < len; i++)
            narr[i] = arr[arr[i]];

        return narr;
    }

}
