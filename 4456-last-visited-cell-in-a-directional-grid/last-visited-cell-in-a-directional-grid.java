class Solution {
    public int[] helper(char[][] grid,int r,int c,boolean[][] visited){
        visited[r][c] = true;
        int nr=r;
        int nc=c;
        char ch = grid[r][c];
        if(ch == 'U') nr--;
        else if(ch == 'D') nr++;
        else if(ch == 'R') nc++;
        else if(ch == 'L') nc--;
        else return new int[]{r, c};

        if(nr < 0 || nr >= grid.length || nc < 0 || nc >= grid[0].length || visited[nr][nc]){
            return new int[]{r,c};
        }

        return helper(grid,nr,nc,visited);


    }
    public int[] lastVisitedCell(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        return helper(grid,0,0,visited);
    }
}