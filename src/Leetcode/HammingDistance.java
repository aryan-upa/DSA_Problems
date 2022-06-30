package Leetcode;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int[] arr = new int[256];
        arr[0] = 0;
        for(int i=1; i<256; i++)
            arr[i] = (i&1) + arr[i/2];
        int xor = x ^ y;
        int count = 0;
        count += arr[xor&0xff];
        xor >>= 8;
        count += arr[xor&0xff];
        xor >>= 8;
        count += arr[xor&0xff];
        xor >>= 8;
        count += arr[xor&0xff];
        return count;
    }
}
