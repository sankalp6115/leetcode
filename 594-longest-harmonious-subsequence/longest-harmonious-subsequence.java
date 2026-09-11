class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int res=0;
        int l=0;
        for(int r=0;r<n;r++){
            while(nums[r] - nums[l] > 1){
                l++;
            }
            if(nums[r] - nums[l] == 1){
                res = Math.max(res,r-l+1);
            }
        }
        return res;
    }
}