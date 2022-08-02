package Leetcode;

public class UniquePaths {
    // Further improvement could be done.
    public int uniquePaths(int m, int n) {

        int col = Math.max(m, n);
        int row = Math.min(m, n);

        if (row == 1)
            return 1;

        if (row == 2)
            return col;

        int[] arr1 = new int[col];
        int[] arr2 = new int[col];

        for(int i = 0; i < col; i++)
            arr1[i] = i+1;

        for(int i = 0; i < row-2; i++) {
            arr2[0] = 1;
            for (int j = 1; j < col; j++) {
                arr2[j] = arr2[j-1] + arr1[j];
                arr1[j] = arr2[j];
            }
        }

        return arr2[col-1];
    }
}
