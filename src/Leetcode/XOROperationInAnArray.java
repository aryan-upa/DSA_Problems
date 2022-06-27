package Leetcode;

public class XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        int XOR = start;
        start += 2;
        n--;
        while(n > 0) {
            XOR = XOR ^ start;
            start += 2;
            n--;
        }
        return XOR;
    }
}
