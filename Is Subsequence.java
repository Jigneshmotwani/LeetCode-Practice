class Solution {
    public boolean isSubsequence(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int c = 1;c<=t.length();c++){
            for(int r = 1;r<=t.length();r++){
                if(s.charAt(r-1)==s.charAt(c-1)){
                    dp[r][c] = dp[r-1][c-1] +1;
                } else{
                    dp[r][c] = Math.max(dp[r-1][c], dp[r][c-1]);
                }
            }
        }
        return s.length() == dp[s.length()][t.length()];
    }
}