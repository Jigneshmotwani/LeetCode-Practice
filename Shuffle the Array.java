class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int t = 0;
        for(int i = 0;i<n;i++){
            ans[t] = nums[i];
            t++;
            ans[t] = nums[i+n];
            t++;
        }
        return ans;
    }
}