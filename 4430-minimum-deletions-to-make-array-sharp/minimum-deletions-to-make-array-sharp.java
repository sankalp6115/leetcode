class Solution {
    public int minDeletions(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        
        for(int i=1;i<nums.length;i++){
            if(list.get(list.size()-1) == nums[i]){
                continue;
            }
            else{
                list.add(nums[i]);
            }
        }
        return nums.length - list.size();
    }
}