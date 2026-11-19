class Solution {
    public int myAtoi(String s) {
        long res=0;
        s = s.trim();
        if(s.isEmpty()) return 0;
        
        int i=0;
        int n = s.length();
        int sign = 1;
        
        if(s.charAt(i) == '+' || s.charAt(i) == '-'){
            sign = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }
        
        while(i<n && Character.isDigit(s.charAt(i))){
            res = res * 10 + (s.charAt(i) - '0');
            if(sign == 1 && res > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && (-1 * res) < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign * res);
    }
}