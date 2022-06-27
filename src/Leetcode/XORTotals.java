package Leetcode;

public class XORTotals {
    public int subsetXORSum(int[] arr) {
        int firstLoopEnd = 1 << arr.length;
        int arrLen = arr.length;
        int xorPerSet;
        int xorTotal = 0;
        for (int i=0; i < firstLoopEnd; i++) {
            xorPerSet = 0;

            for (int j = 0; j < arrLen; j++)
                if ((i & (1 << j)) > 0)
                    xorPerSet = xorPerSet ^ arr[j];

            xorTotal += xorPerSet;
        }
        return xorTotal;
    }
}
