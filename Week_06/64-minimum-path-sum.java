package Week_06;

class Solution {
    public int minPathSum(int[][] grid) {

        // check border
        if (grid == null) {
            return 0;
        }
        int m = grid.length;
        if (m == 0) {
            return 0;
        }
        int n = grid[0].length;
        if (n == 0) {
            return 0;
        }

        // init dp[]
        // dp[0][i] = dp[0][i - 1] + grid[0][i]
        int[] dp = new int[n];
        dp[0] = grid[0][0];
        for (int j = 1; j < n; ++j) {
            dp[j] = dp[j - 1] + grid[0][j];
        }

        for (int i = 1; i < m; ++i) {
           // dp[i][j] = min(dp[i-1][j], dp[i][j]) + grid[i][j];
           dp[0] += grid[i][0];
           for (int j = 1; j < n; ++j) {
                if (dp[j] > dp[j - 1]) {
                    dp[j] = dp[j - 1] + grid[i][j];
                } else {
                    dp[j] += grid[i][j];
                }
            }
        }
        return dp[ n - 1 ];
    }
}