class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(st.isEmpty()){
                st.push(curr);
            }
            else{
                if(curr == '(') st.push(curr);
                else{
                    if(st.peek() == '(') st.pop();
                    else st.push(curr);
                }
            }
        }
        // System.out.println(st);
        return st.size();
    }
}