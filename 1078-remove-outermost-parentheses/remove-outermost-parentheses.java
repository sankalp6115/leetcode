class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == '('){
                open++;
            }
            else if(curr == ')' && open>0){
                close++;
            }
            temp.append(curr);

            if(open == close){
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