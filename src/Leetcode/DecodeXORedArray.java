package Leetcode;

public class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        int pos = 0;
        res[pos++] = first;
        for (int ele : encoded) {
            int nextEle = ele ^ first;
            res[pos++] = nextEle;
            first = nextEle;
        }
        return res;
    }
}
