class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        int goalCount=0;
        int res=0;
    
        for(int num:nums){
            if(num != 0){
                goalCount += 1;
            }
            res += map.getOrDefault(goalCount - goal,0);
            map.put(goalCount, map.getOrDefault(goalCount,0)+1);
        }
        return res;
    }
}