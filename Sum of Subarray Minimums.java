import java.util.Arrays;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            int k = indexPreviousSmaller(Arrays.copyOf(arr, i), arr[i]);
            if (k == -1) {
                dp[i] = (i + 1) * arr[i];
            } else {
                dp[i] = dp[k] + (i - k) * arr[i];
            }
        }
        long sumOfMinimums = 0;
        int MOD = 1000000007;
        for (int count : dp) {
            sumOfMinimums += count;
            sumOfMinimums %= MOD;
        }

        return (int) sumOfMinimums;
    }

    public int indexPreviousSmaller(int[] arr, int a) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < a) {
                return i;
            }
        }
        return -1; // no previous smaller
    }
}