class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] maxA = new int[n];
        int[] minA = new int[n];
        int max = nums[0];
        int min = nums[n-1];

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