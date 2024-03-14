class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result = 0;
        int i = 0;
        while (i < nums.length) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == goal) {
                    result++;
                }
                if (sum > goal) {
                    break;
                }
            }
            i++;
        }

        return result;
    }
}