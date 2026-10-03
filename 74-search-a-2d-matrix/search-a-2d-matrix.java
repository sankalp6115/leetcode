class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row=0;
        int col=m-1;
        int l_row=0;
        int r_row=n-1;

        int psbl_row=0;

        int l_col=0;
        int r_col=m-1;
        while(l_row <= r_row){
            int mid_row = (l_row+r_row)/2;
            if(matrix[mid_row][0] == target){
                return true;
            }
            else if(matrix[mid_row][0] < target){
                psbl_row=mid_row;
                l_row = mid_row + 1;
            }
            else{
                r_row = mid_row - 1;
            }
        }

        while(l_col <= r_col){
            int mid_col=(l_col+r_col)/2;
            if(matrix[psbl_row][mid_col] == target){
                return true;
            }
            else if(matrix[psbl_row][mid_col] < target){
                l_col = mid_col + 1;
            }
            else{
                r_col = mid_col - 1;
            }
        }
        return false;
    }
}