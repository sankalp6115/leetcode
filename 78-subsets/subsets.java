class Solution {
    public void helper(int[] nums,int idx,List<Integer> list,List<List<Integer>> res){
        if(idx == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        
        list.add(nums[idx]);
        helper(nums,idx+1,list,res);
        list.remove(list.size()-1);
        helper(nums,idx+1,list,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums,0,new ArrayList<>(),res);
        return res;
    }
}