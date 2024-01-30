class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int max_t = 0;
        for (int i = 0; i < n; i++) {
            max_t = max_t + nums[i];
            if (max < max_t)
                max = max_t;
            if (max_t < 0) {
                max_t = 0;
            }
        }
        return max;
    }
}