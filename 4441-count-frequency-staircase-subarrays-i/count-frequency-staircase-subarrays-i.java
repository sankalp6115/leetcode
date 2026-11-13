class Solution {
    public boolean isStair(List<Integer> arr){
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i+1) - arr.get(i) != 1){
                return false;
            }
        }
        return true;
    }
    public int countStaircase(int[] nums) {
        int n = nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
            for(int j=i;j<n;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                boolean valid = true;
                int expctd = 1;
                
                for (int freq : map.values()) {
                    if (freq != expctd) {
                        valid = false;
                        break;
                    }
                    expctd++;
                }

                if (valid) {
                    res++;
                }
            }
        }
        return res;
    }
}