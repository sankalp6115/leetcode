class Solution {
    public int countConsistent(int[] nums) {
        int res=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=nums[i];
                int min=Integer.MAX_VALUE;

                for(int k=i;k<=j;k++){
                    min = Math.min(min,nums[k]);
                    sum = sum & nums[k];
                }

                if(sum == min) res++;
            }
        }
        return res;
    }
}