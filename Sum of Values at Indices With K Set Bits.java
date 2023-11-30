class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int r = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (noofbits(i) == k) {
                r += nums.get(i);
            }
        }
        return r;
    }

    public int noofbits(int n) {
        int result = 0;
        int i = 10;
        while (n != 0) {

            if (n / Math.pow(2, i) > 1) {
                result++;
                n = (int) ((int) n % Math.pow(2, i));
            }
            i--;
        }
        System.out.println(result);
        return result;
    }
}