class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=Integer.MIN_VALUE;
        for(int i:piles){
            r = Math.max(r,i);
        }

        int res=0;
        while(l <= r){
            int m = l+(r-l)/2;
            long time = 0;
            // time calc
            for(int pile:piles){
                time += (pile + m - 1) / m;
            }
            
            // System.out.printf("Left: %d, Right: %d, Mid: %d, Time: %d" ,l,r,m,time);
            // System.out.println();

            if(time == h){
                res = m;
                r = m-1;
            }
            else if(time > h){
                l = m + 1;
            }
            else{
                res = m;
                r = m-1;
            }
        }
        return res;
    }
}