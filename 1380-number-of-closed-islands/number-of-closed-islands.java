class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public void bfs(int[][] grid,boolean[][] visited,int row,int col,int n,int m){
        if(visited[row][col]) return;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(row,col));
        while(!q.isEmpty()){
            Pair cell = q.poll();
            visited[cell.row][cell.col] = true;
            if (cell.row > 0 && grid[cell.row - 1][cell.col] == 0 && !visited[cell.row - 1][cell.col]) {
                visited[cell.row - 1][cell.col] = true;
                q.offer(new Pair(cell.row - 1, cell.col));
            }
            if(cell.row < n-1 && grid[cell.row + 1][cell.col] == 0 && !visited[cell.row + 1][cell.col]){
                visited[cell.row + 1][cell.col] = true;
                q.offer(new Pair(cell.row+1,cell.col));
            }
            if(cell.col > 0 && grid[cell.row][cell.col-1] == 0 && !visited[cell.row][cell.col - 1]){
                visited[cell.row][cell.col-1] = true;
                q.offer(new Pair(cell.row,cell.col-1));
            }
            if(cell.col < m-1 && grid[cell.row][cell.col+1] == 0 && !visited[cell.row][cell.col + 1]){
                visited[cell.row][cell.col+1] = true;
                q.offer(new Pair(cell.row,cell.col+1));
            }
        }
        return;
    }
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        for(int i=0;i<m;i++){
            if(grid[0][i] == 0) bfs(grid,visited,0,i,n,m);
        }
        for(int i=0;i<m;i++){
            if(grid[n-1][i] == 0) bfs(grid,visited,n-1,i,n,m);
        }
        for(int i=0;i<n;i++){
            if(grid[i][0] == 0) bfs(grid,visited,i,0,n,m);
        }
        for(int i=0;i<n;i++){
            if(grid[i][m-1] == 0) bfs(grid,visited,i,m-1,n,m);
        }

        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 0 && !visited[i][j]){
                    bfs(grid,visited,i,j,n,m);
                    res += 1;
                }
            }
        }
        return res;
    }   
}