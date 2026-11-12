class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int incMax = 1;
        int decMax = 1;
        int increasing = 1;
        int decreasing = 1;
        for(int i=0;i<n-1;i++){
            if(nums[i] < nums[i+1]){
                increasing++;
                incMax = Math.max(incMax,increasing);
            }
            else{
                incMax = Math.max(incMax,increasing);
                increasing = 1;
            }
        }

        for(int i=0;i<n-1;i++){
            if(nums[i] > nums[i+1]){
                decreasing++;
                decMax = Math.max(decMax,decreasing);
            }
            else{
                decMax = Math.max(decMax,decreasing);
                decreasing = 1;
            }
        }
        // System.out.println(increasing);
        // System.out.println(decreasing);
        // System.out.println(incMax);
        // System.out.println(decMax);
        return Math.max(incMax,decMax);
    }
}