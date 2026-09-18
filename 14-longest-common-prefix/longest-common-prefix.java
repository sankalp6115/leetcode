class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int n = strs.length;
        int m = Integer.MAX_VALUE;
        for(String s:strs) m = Math.min(s.length(),m);
        Stack<Character> st = new Stack<>();
        for(int i=strs[0].length()-1;i>-1;i--){
            st.push(strs[0].charAt(i));
        }
        
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                char curr = strs[j].charAt(i);
                if(st.peek() != curr){
                    return sb.toString();
                }
                else{
                    continue;
                }
            }
            sb.append(st.pop());
        }
        return sb.toString();
    }
}