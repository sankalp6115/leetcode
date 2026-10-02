class Solution {
    public void helper(int n,int open,int close,StringBuilder sb,List<String> res){
        if(open == n && close == n){
            res.add(sb.toString());
            return;
        }
        if(open < n){
            sb.append('(');
            helper(n,open+1,close,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            helper(n,open,close+1,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(n,0,0,sb,res);
        return res;
    }
}