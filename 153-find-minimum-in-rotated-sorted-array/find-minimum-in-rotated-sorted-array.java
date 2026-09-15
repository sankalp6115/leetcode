class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l=0;
        int r=n-1;
        int res=0;

        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] > nums[n-1]){
                l = mid + 1;
            }
            else{
                res = nums[mid];
                r = mid - 1;
            }
        }

        return res;
    }
}