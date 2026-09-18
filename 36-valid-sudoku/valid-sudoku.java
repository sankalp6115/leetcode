class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rowSet = new HashSet[9];
        HashSet<Character>[] colSet = new HashSet[9];
        HashSet<Character>[] subMatSet = new HashSet[9];
        for(int i=0; i<9; i++){
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            subMatSet[i] = new HashSet<>();
        }
        int n = board.length;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char val = board[i][j];

                if(val == '.') continue;

                if(rowSet[i].contains(val)) return false;
                rowSet[i].add(val);

                if(colSet[j].contains(val)) return false;
                colSet[j].add(val);

                int idx = (i / 3) * 3 + (j / 3);

                if(subMatSet[idx].contains(val)) return false;
                subMatSet[idx].add(val);
            }
        }
        return true;
    }
}