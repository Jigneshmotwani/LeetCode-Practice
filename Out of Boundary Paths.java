class Solution {
    private static final int MOD = 1000000007;
    private static final int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove + 1];
        for (int[][] rows : dp) {
            for (int[] row : rows) {
                Arrays.fill(row, -1);
            }
        }
        return recurse(startRow, startColumn, maxMove, dp);
    }

    private int recurse(int x, int y, int remainingMove, int[][][] dp) {
        if (x < 0 || x == dp.length || y < 0 || y == dp[0].length) {
            return 1;
        }
        if (remainingMove == 0) {
            return 0;
        }
        if (dp[x][y][remainingMove] != -1) {
            return dp[x][y][remainingMove];
        }
        dp[x][y][remainingMove] = 0;
        for (int[] dir : dirs) {
            dp[x][y][remainingMove] = (dp[x][y][remainingMove] + recurse(x + dir[0], y + dir[1], remainingMove - 1, dp))
                    % MOD;
        }
        return dp[x][y][remainingMove];
    }
}