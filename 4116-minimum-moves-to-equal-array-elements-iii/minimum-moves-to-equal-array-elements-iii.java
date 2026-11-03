class Solution {
    public int minMoves(int[] nums) {
        int res=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            res += (max - nums[i]);
        }

        return res;
    }
}