class Solution {
    public int maxDepth(String s) {
        int max=0;
        int len=0;
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '('){
                len++;
            }
            else if(curr == ')'){
                len--;
            }
            else{
                continue;
            }
            max = Math.max(max,len);
        }

        return max;
    }
}