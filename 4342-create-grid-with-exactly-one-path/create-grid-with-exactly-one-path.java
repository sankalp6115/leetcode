class Solution {
    public String[] createGrid(int m, int n) {
        String[][] temp = new String[m][n];
        for(int i=0;i<m;i++){
            temp[i][0] = ".";
        }

        for(int i=0;i<n;i++){
            temp[m-1][i] = ".";
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                 if(temp[i][j] == null) temp[i][j] = "#";
            }
        }


        String[] ans = new String[m];
        
        for(int i=0;i<m;i++){
            ans[i] = String.join("", temp[i]);
        }
        
       return ans;
    }
}