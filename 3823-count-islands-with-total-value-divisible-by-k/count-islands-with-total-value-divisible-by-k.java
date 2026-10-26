class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public long helper(int[][] grid,boolean[][] visited,int row,int col,int n,int m){
        if(visited[row][col] || grid[row][col] == 0){
            return -1;
        }
        
        long sum=0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(row,col));
        visited[row][col] = true;
        sum += grid[row][col];
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            if(p.row>0 && !visited[p.row-1][p.col] && grid[p.row-1][p.col] != 0){
                visited[p.row-1][p.col] = true;
                q.offer(new Pair(p.row-1,p.col));
                sum += grid[p.row-1][p.col];
            }
            if(p.row<n-1 && !visited[p.row+1][p.col] && grid[p.row+1][p.col] != 0){
                visited[p.row+1][p.col] = true;
                q.offer(new Pair(p.row+1,p.col));
                sum += grid[p.row+1][p.col];
            }
            if(p.col>0 && !visited[p.row][p.col-1] && grid[p.row][p.col-1] != 0){
                visited[p.row][p.col-1] = true;
                q.offer(new Pair(p.row,p.col-1));
                sum += grid[p.row][p.col-1];
            }
            if(p.col<m-1 && !visited[p.row][p.col+1] && grid[p.row][p.col+1] != 0){
                visited[p.row][p.col+1] = true;
                q.offer(new Pair(p.row,p.col+1));
                sum += grid[p.row][p.col+1];
            }
        }
    
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                long ans = helper(grid,visited,i,j,n,m);
                if(ans == -1) continue;
                if(ans % k == 0) res++;
                else continue;
            }
        }
        return res;
    }
}