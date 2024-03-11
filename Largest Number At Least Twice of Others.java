class Solution {
    public int dominantIndex(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > b) {
                a = b;
                b = nums[i];
            }
            else if (nums[i] > a) {
                a = nums[i];
            }
        }
        int c = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == b) {
                if (b >= 2 * a) {
                    c = i;
                }
            }
        }
        return c;
    }
}