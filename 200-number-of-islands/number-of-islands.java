class Solution {
    public int idx(char[][] grid, int r,int c){
        int rt = grid.length;
        int ct = grid[0].length;
        return ct * r + c;
    }
    public void helper(char[][] grid,int[] visited,int r,int c,int ans){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length){
            return;
        }
        if(grid[r][c] == '0' || visited[idx(grid,r,c)]==1){
            return;
        }
        if(grid[r][c] == '1'){
            visited[idx(grid,r,c)] = 1;
            if(c<grid[0].length){
                helper(grid,visited,r,c+1,ans);
            }
            if(c>0){
                helper(grid,visited,r,c-1,ans);
            }
            if(r<grid.length){
                helper(grid,visited,r+1,c,ans);
            }
            if(r>0){
                helper(grid,visited,r-1,c,ans);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] visited = new int[m*n];
        int ans=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && visited[idx(grid,i,j)] == 0){
                    ans++;
                    helper(grid,visited,i,j,ans);
                }
            }
        }
        return ans;
    }
}