class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = helper(coins, n, amount, dp);

        return ans == Integer.MAX_VALUE ? -1 : ans;

    }

    private int helper(int[] coins, int n, int amount, int[][] dp) {
        //base case
        if (amount == 0) {
            return 0;
        }

        if (n == 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[n][amount] != -1) {
            return dp[n][amount];
        }

        if (coins[n - 1] <= amount) {
            int include = helper(coins, n, amount - coins[n - 1], dp);
            int exclude = helper(coins, n - 1, amount, dp);

            if (include != Integer.MAX_VALUE) {
                include = 1 + include;
            }

            dp[n][amount] = Math.min(include, exclude);
        }

        else {
            dp[n][amount] = helper(coins, n - 1, amount, dp);
        }
        return dp[n][amount];
    }

}