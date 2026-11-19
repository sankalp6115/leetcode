class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int copy=x;
        if(x<0) return false;
        if(x==0) return true;
        while(copy>0){
            int digit = copy%10;
            rev = 10 * rev + digit;
            copy = copy/10;
        }

        return rev == x;
    }
}