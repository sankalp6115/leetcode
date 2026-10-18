class Solution {
    public void helper(List<String> res,StringBuilder sb,int n,int len){
        if(len == n){
            res.add(new String(sb.toString()));
            return;
        }
        
        if(sb.charAt(sb.length()-1) == 'a'){
            sb.append('b');
            helper(res,sb,n,sb.length());
            sb.deleteCharAt(sb.length()-1);
    
            sb.append('c');
            helper(res,sb,n,sb.length());
            sb.deleteCharAt(sb.length()-1);    
        }
        else if(sb.charAt(sb.length()-1) == 'b'){
            sb.append('a');
            helper(res,sb,n,sb.length());
            sb.deleteCharAt(sb.length()-1);

            sb.append('c');
            helper(res,sb,n,sb.length());
            sb.deleteCharAt(sb.length()-1);    
        }
        else if(sb.charAt(sb.length()-1) == 'c'){
            sb.append('a');
            helper(res,sb,n,sb.length());
            sb.deleteCharAt(sb.length()-1);

            sb.append('b');
            helper(res,sb,n,sb.length());
            sb.deleteCharAt(sb.length()-1);    
        }
    }
    public String getHappyString(int n, int k) {
        List<String> res = new ArrayList<>();

        for (char ch : new char[]{'a', 'b', 'c'}) {
            StringBuilder sb = new StringBuilder();
            sb.append(ch);
            helper(res, sb, n, sb.length());
        }

        Collections.sort(res);

        if (k > res.size()) {
            return "";
        }

        return res.get(k - 1);
    }
}