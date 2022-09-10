package Leetcode;

public class Arranging_Coins {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
    }

    public static int arrangeCoins(int n) {
        int l = 0;
        int h = n;

        int ans = 0;
        while (l <= h) {
            int mid = l + (h-l) / 2;

            long val = (long) mid * (mid + 1) / 2;

            if (val <= n) {
                ans = mid;
                l = mid + 1;
            }

            else
                h = mid - 1;
        }

        return ans;
    }
}
