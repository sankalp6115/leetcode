class Solution {
    public boolean helper(char[][] board,int idx,String word,int row,int col,int n,int m,boolean[][] visited){
        if(idx == word.length()){
            return true;
        }
        if (row < 0 || row >= n || col < 0 || col >= m
                || visited[row][col]
                || board[row][col] != word.charAt(idx)) {
            return false;
        }

        visited[row][col] = true;

        if( helper(board,idx+1,word,row+1,col,n,m,visited) ||
            helper(board,idx+1,word,row-1,col,n,m,visited) || 
            helper(board,idx+1,word,row,col+1,n,m,visited) ||
            helper(board,idx+1,word,row,col-1,n,m,visited)
        ){
            return true;
        }
        
        visited[row][col] = false;
        
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(helper(board,0,word,i,j,n,m,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}