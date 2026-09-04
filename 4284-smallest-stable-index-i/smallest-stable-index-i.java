class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] min = new int[n];
        int[] max = new int[n];
        int maxn = nums[0];
        int minn = nums[n-1];
        max[0] = maxn;
        min[n-1] = minn;
        for(int i=1;i<n;i++){
            maxn = Math.max(maxn,nums[i]);
            max[i] = maxn;
        }
        for(int i=n-2;i>-1;i--){
            minn = Math.min(minn,nums[i]);
            min[i] = minn;
        }

        for(int i=0;i<n;i++){
            if(max[i] - min[i] <= k){
                return i;
            }
        }
        return -1;
    }

}