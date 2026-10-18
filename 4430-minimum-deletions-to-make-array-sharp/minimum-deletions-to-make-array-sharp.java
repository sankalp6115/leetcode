class Solution {
    public int minDeletions(int[] nums) {
        int last=nums[0];
        int res=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == last){
                res++;
            }
            else{
                last = nums[i];
            }
        }
        return res;
    }
}