class Solution {
    public int maxProfit(int[] nums) {
        int profit=0;
        int l=0;
        int r=1;
        int n=nums.length;
        while(r<n){
            if(nums[l] > nums[r]){
                l=r;
                r++;
            }         
            else{
                profit = Math.max(profit,nums[r] - nums[l]);
                r++;
            }  
        }   
        return profit;
    }
}