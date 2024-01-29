class Solution {
    public int minOperations(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
            i++;
            if (i < n && s.charAt(i) == '0') {
                count++;
            }
        }
        return Math.min(count, n - count);
    }
}