import java.util.Arrays;

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 1; i <= arr.length; i += 2) {
            for (int j = 0; j <= arr.length - i; j++) {
                int[] temp = Arrays.copyOfRange(arr, j, j + i);
                sum += sum(temp);
            }

        }
        return sum;

    }

    public int sum(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        System.out.println(ans);
        return ans;
    }
}