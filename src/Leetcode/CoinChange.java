package Leetcode;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] ex = new int[amount+1];
        ex[0] = 0;

        for (int i = 1; i <= amount; i++) {
            ex[i] = amount+1;
            for (int coin : coins)
                if (i - coin >= 0)
                    ex[i] = Math.min(ex[i - coin] + 1, ex[i]);
        }

        if (ex[amount] == amount + 1) return -1;
        return ex[amount];
    }
}
