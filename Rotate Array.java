class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k % l;
        int[] nums2 = new int[l];
        for (int i = l - k; i < l; i++) {
            nums2[i - l + k] = nums[i];
        }
        for (int i = 0; i < l - k; i++) {
            nums2[k + i] = nums[i];
        }
        for (int i = 0; i < l; i++) {
            nums[i] = nums2[i];
        }

    }
}