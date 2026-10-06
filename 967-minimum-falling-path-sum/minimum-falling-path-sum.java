class Solution {
    public int helper(int[][] matrix,int row,int col,int n,int[][] dp){
        if(row == n-1){
            return matrix[row][col];
        }

        if(dp[row][col] != Integer.MIN_VALUE){
            return dp[row][col];
        }
        
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;

        if(col > 0){
            left = helper(matrix,row+1,col-1,n,dp);
        }
        int bottom = helper(matrix,row+1,col,n,dp);
        if(col < n-1){
            right = helper(matrix,row+1,col+1,n,dp);
        }
        dp[row][col] = matrix[row][col] + Math.min(Math.min(left,right),bottom);
        return dp[row][col];

    }
    public int minFallingPathSum(int[][] matrix) {
        int res = Integer.MAX_VALUE;
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for(int[] row:dp) Arrays.fill(row,Integer.MIN_VALUE);
        for(int i=0;i<n;i++){
            res = Math.min(res,helper(matrix,0,i,n,dp));
        }

        return res;
    }
}