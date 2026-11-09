class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == 'i'){
                sb.reverse();
            }
            else{
                sb.append(curr);
            }
        }
        return sb.toString();
    }
}