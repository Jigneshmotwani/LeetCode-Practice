class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int l = numbers.length;
        for (int i = 0; i < l; i++) {

            for (int j = 1 + i; j < l; j++) {
                if (numbers[j] + numbers[i] == target) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                    return arr;
                }
            }
        }
        return null;
    }
}