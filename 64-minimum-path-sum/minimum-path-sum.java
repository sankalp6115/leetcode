class Solution {
    int res=Integer.MAX_VALUE;
    public int helper(int[][] grid,int sum,int row,int col,int[][] dp){
        int n = grid.length;
        int m = grid[0].length;
        if(dp[row][col] != -1){
            return dp[row][col];
        }
        if(row == n-1 && col == m-1){
            return grid[row][col];
        }

        int down = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;

        if(row < n-1) {
            down = helper(grid,sum+grid[row+1][col],row+1,col,dp);
        }
        if(col < m-1) {
            right = helper(grid,sum+grid[row][col+1],row,col+1,dp);
        }
        
        int ans = grid[row][col] + Math.min(down,right);
        dp[row][col] = ans;
        return ans;
    }
    public int minPathSum(int[][] grid) {
        int res=Integer.MAX_VALUE;
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int[] arr:dp) Arrays.fill(arr,-1);
        res = helper(grid,0,0,0,dp);
        return res;
    }
}