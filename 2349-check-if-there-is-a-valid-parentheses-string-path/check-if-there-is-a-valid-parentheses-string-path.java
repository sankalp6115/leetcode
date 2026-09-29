class Solution {
    public boolean helper(char[][] grid,int row,int col,int balance,int[][][] dp){
        int n = grid.length;
        int m = grid[0].length;

        if (grid[row][col] == '(') balance++;
        else balance--;

        if(balance < 0) return false;

        if(row == n-1 && col == m-1){
            return balance==0;
        }

        if(dp[row][col][balance] != 0){
            return dp[row][col][balance]==1;
        }

        if(row < n-1){
            if(helper(grid,row+1,col,balance,dp)){
                dp[row][col][balance] = 1;
                return true;
            }
        }
        
        if(col < m-1){
            if(helper(grid,row,col+1,balance,dp)){
                dp[row][col][balance] = 1;
                return true;
            }
        }   
        
        dp[row][col][balance] = -1;
        return false;
    }

    public boolean hasValidPath(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][n+m-1];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         Arrays.fill(dp[i][j], -1);
        //     }
        // }
        if(grid[0][0] == ')' || grid[n-1][m-1] == '(') return false;
        StringBuilder s = new StringBuilder();
        return helper(grid,0,0,0,dp);
    }
}