class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int m = bank[0].length();
        int res=0;
        int prevRow = 0;
        int currRow = 0;
        for(int i=0;i<m;i++){
            if(bank[0].charAt(i) == '1'){
                prevRow++;
            }
        }

        for(int i=1;i<n;i++){
            currRow=0;
            for(int j=0;j<m;j++){
                if(bank[i].charAt(j) == '1'){
                    currRow++;
                }
            }
            res += (currRow * prevRow);
            if(currRow != 0){
                prevRow = currRow;
            }
        }
        return res;
    }
}