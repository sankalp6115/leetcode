class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == '('){
                st.push(curr);
            }
            else if(curr == ')' && st.peek() == '('){
                st.pop();
            }
            temp.append(curr);

            if(st.isEmpty()){
                if(temp.length() == 2){
                }
                else{
                    temp.deleteCharAt(0);
                    temp.deleteCharAt(temp.length()-1);
                    sb.append(temp);
                }
                temp.setLength(0);
            }
        }
        return sb.toString();
    }
}