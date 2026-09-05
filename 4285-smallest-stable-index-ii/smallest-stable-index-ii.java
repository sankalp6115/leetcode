class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        long[] maxA = new long[n];
        long[] minA = new long[n];
        long max = nums[0];
        long min = nums[n-1];

        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            maxA[i] = max;
        }

        for(int i=n-1;i>-1;i--){
            min = Math.min(min,nums[i]);
            minA[i] = min;
        }

        for(int i=0;i<n;i++){
            if(maxA[i] - minA[i] <= k){
                return i;
            }
        }
        return -1;
    }
}