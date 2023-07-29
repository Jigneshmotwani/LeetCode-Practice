class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int l = nums.length;
        for (int i = 0; i < l; i++) {

            for (int j = 1 + i; j < l; j++) {
                if (nums[j] + nums[i] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;

                }

            }

        }

        return null;
    }

}
