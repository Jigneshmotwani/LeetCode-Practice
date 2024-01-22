import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int n = startTime.length;
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[1]));
        int[] dp = new int[n];
        dp[0] = jobs[0][2];
        
        
        for (int i = 1; i < n; i++) {
            int currProfit = jobs[i][2];
            int prevProfit = 0;
            int prevJob = i - 1;
            while (prevJob >= 0) {
                if (jobs[prevJob][1] <= jobs[i][0]) {
                    prevProfit = dp[prevJob];
                    break;
                }
                prevJob--;
            }
            dp[i] = Math.max(currProfit + prevProfit, dp[i - 1]);
        }

        return dp[n - 1];
        
        
    }
}