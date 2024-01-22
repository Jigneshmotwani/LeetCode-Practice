class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        if (nums.length == 1) {
            return nums[0];
        }

        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            if (i - 3 >= 0) {
                dp[i] = Math.max(dp[i - 2], dp[i - 3]) + nums[i];
            } else if (i - 2 >= 0) {
                dp[i] = dp[i - 2] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }
        return Math.max(dp[n-1], dp[n-2]);
    }
}