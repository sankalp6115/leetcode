class Solution {
    public void helper(int n,int open, int close, StringBuilder s, List<String> list){
        if(open == n && close == n){
            list.add(s.toString());
            return;
        }
        if(open < n){
            s.append("(");
            helper(n,open+1,close,s,list);
            s.deleteCharAt(s.length()-1);
        }
        if(close < open){
            s.append(")");
            helper(n,open,close+1,s,list);
            s.deleteCharAt(s.length()-1);
        }
        return;
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(n,0,0,sb,ans);
        return ans;
    }
}