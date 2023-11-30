class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = result(nums, nums[i]);
        }
        return ans;
    }

    public int result(int[] nums, int n) {
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < n)
                r++;
        }
        return r;
    }
}