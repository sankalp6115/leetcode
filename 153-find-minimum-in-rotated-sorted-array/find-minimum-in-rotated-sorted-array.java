class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l=0;
        int r=n-1;
        int res=-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] > nums[n-1]){
                //part2
                l = mid + 1;
            }
            else{
                //part1
                res = nums[mid];
                r = mid - 1;
            }
        }
        return res;
    }
}