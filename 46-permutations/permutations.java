class Solution {
    public void helper(int[] nums,List<Integer> list,List<List<Integer>> res){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        // list.add(nums[idx]);
        // helper(nums,idx+1,list,res);
        // helper(nums,idx,list,res);
        // list.remove(list.size()-1);
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                helper(nums,list,res);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(nums,list,res);
        System.out.println(res);
        return res;
    }
}