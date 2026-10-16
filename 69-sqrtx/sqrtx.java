class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x; 
        int l=1;
        int r=x;
        while(l<=r){
            int mid = l+(r-l)/2;
            if((long) mid*mid == x){
                return mid;
            }
            else if((long) mid*mid < x){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return Math.round(r);
    }
}