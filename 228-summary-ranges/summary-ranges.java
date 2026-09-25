class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ans = new ArrayList<>();
        if(nums.length == 0) return ans;
        int l=0;
        int r=0;
        for(r=0;r<nums.length-1;r++){
            if(nums[r] == nums[r+1]-1){
                continue;
            }
            else{
                if(l == r){
                    String part = String.valueOf(nums[l]);
                    ans.add(part);
                }
                else{
                    String part = nums[l] + "->" + nums[r];
                    ans.add(part);
                }
                l = r + 1;
            }
        }
        if(l == r){
            String part = String.valueOf(nums[l]);
            ans.add(part);
        }
        else{
            String part = nums[l] + "->" + nums[r];
            ans.add(part);
        }
        return ans;
    }
}