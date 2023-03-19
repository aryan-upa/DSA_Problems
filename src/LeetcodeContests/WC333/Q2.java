package LeetcodeContests.WC333;

public class Q2 {
    static int[] powers = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072};

    public int minOperations(int n) {
        int min = 1;
        int max = 131072;

        for (int i = 0; i < powers.length; i ++) {
            if (powers[i] == n)
                return 1;
            if (powers[i] > n) {
                max = powers[i];
                min = powers[i-1];
                break;
            }
        }

        return 1 + Math.min(minOperations(max - n), minOperations(n - min));
    }
}
