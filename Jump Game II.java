class Solution {
    public int jump(int[] nums) {

    }
    
    public boolean canJump(int[] nums) {
        int l = nums.length;
        if (l == 1) {
            return true;
        }
        int toreach = l - 1;
        int i = l - 2;
        while (i>=0 && toreach > 0) {
            if (nums[i] + i >= toreach) {
                toreach = i;
            } 
            i--;
        }
        return toreach == 0;
    }
}