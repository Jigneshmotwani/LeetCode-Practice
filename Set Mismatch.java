class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] count = new int[nums.length + 1];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                result[1] = i;
            } else if (count[i] == 2) {
                result[0] = i;
            }
        }
        return result;
    }
}