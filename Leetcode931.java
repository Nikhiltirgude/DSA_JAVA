class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];

        for (int j = 0; j < n; j++) {
            dp[m - 1][j] = matrix[m - 1][j];
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int down = matrix[i][j] + dp[i + 1][j];
                int left = (j > 0) ? matrix[i][j] + dp[i + 1][j - 1] : Integer.MAX_VALUE;
                int right = (j < n - 1) ? matrix[i][j] + dp[i + 1][j + 1] : Integer.MAX_VALUE;

                dp[i][j] = Math.min(down, Math.min(right, left));
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < dp.length; j++) {
            ans = Math.min(ans, dp[0][j]);
        }

        return ans;
    }

    // private int helper(int[][] arr, int i, int j, int[][] dp) {
    //     if (j > arr[0].length - 1 || j < 0)
    //         return 1000007;
    //     if (i == arr.length - 1)
    //         return arr[i][j];

    //     if (dp[i][j] != -1)
    //         return dp[i][j];

    //     int down = arr[i][j] + helper(arr, i + 1, j, dp);
    //     int diagonal = arr[i][j] + helper(arr, i + 1, j + 1, dp);
    //     int right = arr[i][j] + helper(arr, i + 1, j - 1, dp);

    //     return dp[i][j] = Math.min(down, Math.min(diagonal, right));
    // }
}