class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i:nums) set.add(i);
        for(int i=1;i<=n+1;i++){
            if(!set.contains(k*i)){
                return k*i;
            }
        }
        return -1;
    }
}