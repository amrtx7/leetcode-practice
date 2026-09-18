class Solution {
    public int solve(int n, int[] dp){
        if(n<=2){
            return n;
        }
        if(dp[n]!=-1) return dp[n];
        dp[n] = solve(n-1,dp) + solve(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        for(int i=0;i<dp.length;i++) dp[i] = -1;
        return solve(n,dp);
    }
}