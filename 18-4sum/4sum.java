class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i-1] == nums[i]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j-1] == nums[j]) continue;
                int l = j+1;
                int r = n-1;
                while(l < r){
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum == target){
                        List<Integer> list = new ArrayList<>();
                        Collections.addAll(list,nums[i],nums[j],nums[l],nums[r]);
                        res.add(list);
                        l++; r--;

                        while(l<r && nums[l] == nums[l-1]) l++;
                        while(l<r && nums[r] == nums[r+1]) r--;
                    }
                    else if(sum < target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return res;
    }
}