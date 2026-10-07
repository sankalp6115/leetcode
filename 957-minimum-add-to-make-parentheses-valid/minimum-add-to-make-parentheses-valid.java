class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == '('){
                open++;
            }
            else{
                if(open > 0){
                    open--;
                }
                else close++;
            }
        }
        System.out.printf("%d %d",open,close);
        return open+close;
    }
}