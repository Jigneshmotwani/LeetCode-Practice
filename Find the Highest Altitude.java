class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] result = new int[n + 1];
        result[0] = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            result[i + 1] = result[i] + gain[i];
            max = Math.max(max, result[i + 1]);
        }
        return max;
        
    }
}