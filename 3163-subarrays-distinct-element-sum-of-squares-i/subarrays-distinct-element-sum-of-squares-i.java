class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                HashSet<Integer> set = new HashSet<>();
                for(int x=i;x<=j;x++){
                    set.add(nums.get(x));
                }
                res += (set.size() * set.size());
            }
        }   
        return res;
    }
}