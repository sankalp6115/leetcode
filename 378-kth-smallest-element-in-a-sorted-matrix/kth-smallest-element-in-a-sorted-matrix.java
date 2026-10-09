class Solution {
    public int guessAns(int[][] matrix,int target){
        int n = matrix.length;
        int row=n-1;
        int col=0;
        int start = matrix[row][col];
        int ans=0;
        while(row >= 0 && col < n){
            if(matrix[row][col] == target){
                ans += (row+1);
                col += 1;
            }
            else if(matrix[row][col] < target){
                ans += (row+1);
                col += 1;
            }
            else{
                row -= 1;
            }
        }
        return ans;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int l = matrix[0][0];
        int r = matrix[n-1][n-1];
        int res=0;
        while(l<=r){
            int mid = l+(r-l)/2;
            int ans = guessAns(matrix,mid);
            if(ans >= k){
                res = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return res;
    }
}