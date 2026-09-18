class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    ArrayList<Integer> part = new ArrayList<>();
                    part.add(i);
                    part.add(j);
                    list.add(part);
                }
            }
        }

        for(int i=0;i<list.size();i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[list.get(i).get(0)][j] = 0;
            }

            for(int j=0;j<matrix.length;j++){
                matrix[j][list.get(i).get(1)] = 0;
            }
        }
    }
}