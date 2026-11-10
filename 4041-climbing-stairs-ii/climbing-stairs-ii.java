class Solution {
    public int helper(int n,int[] cost){
        int[] dp = new int[n+1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int minCost = Integer.MAX_VALUE;
            if(i-1 >= 0){
                int price = cost[i-1] + (1*1);
                minCost = Math.min(minCost,dp[i-1]+price);
            }
            if(i-2 >= 0){
                int price = cost[i-1] + (2*2);
                minCost = Math.min(minCost,dp[i-2]+price);
            }
            if(i-3 >= 0){
                int price = cost[i-1] + (3*3);
                minCost = Math.min(minCost,dp[i-3]+price);
            }
            dp[i] = minCost;
        }
        return dp[n];
    }
    public int climbStairs(int n, int[] costs) {
        return helper(n,costs);
    }
}