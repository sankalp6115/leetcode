class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        for(int i=1;i<n;i++){
            nums[i] = nums[i] + nums[i-1];
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                if(i == 0) sum = nums[j]; 
                else sum = nums[j] - nums[i-1];
                if(sum == k) count++;
            }
        }
        return count;
    }
}