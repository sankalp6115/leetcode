class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int c1 = Math.abs(nums[n-1] - nums[2]);
        int c2 = Math.abs(nums[n-3] - nums[0]);
        int c3 = Math.abs(nums[n-2] - nums[1]);

        return Math.min(Math.min(c1,c2),c3);
    }
}