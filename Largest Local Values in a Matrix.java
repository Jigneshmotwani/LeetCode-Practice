
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length - 2][grid.length - 2];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = maxvalue(grid, i, j);
            }
        }
        return ans;
    }

    public int maxvalue(int[][] g, int a, int b) {
        int ans = 0;
        for (int i = a; i < a + 3; i++) {
            for (int j = b; j < b + 3; j++) {

                ans = Math.max(ans, g[i][j]);

            }
        }
        return ans;
    }
}