class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0;i<n;i++){
            int l=i+1;
            int r=n-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(l<r){
                if(nums[l] + nums[r] + nums[i] == 0){
                    List<Integer> list = new ArrayList<>();
                    Collections.addAll(list,nums[i],nums[l],nums[r]);
                    ans.add(list);

                    while(l<n-1 && nums[l] == nums[l+1]) l++;
                    while(r>0 && nums[r-1] == nums[r]) r--;
                    l++;
                    r--;
                }
                else if(nums[l] + nums[r] + nums[i] < 0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return ans;
    }
}