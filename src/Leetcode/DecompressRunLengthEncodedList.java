package Leetcode;

public class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {
        int totalFreq = 0;
        for(int i = 0; i < nums.length; i+=2)
            totalFreq += nums[i];

        int[] res = new int[totalFreq];
        int pos = 0, freq, val;
        for(int i = 0; i < nums.length; i+=2) {
            freq = nums[i];
            val = nums[i+1];
            while(freq > 0) {
                res[pos] = val;
                pos++;
                freq--;
            }
        }

        return res;
    }

}
