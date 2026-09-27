class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        int idx=0;
        while(!map.isEmpty()){
            List<Integer> remove = new ArrayList<>();
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                int key = entry.getKey();
                int val = entry.getValue();
                ans[idx++] = key;

                if(val == 1) remove.add(key);
                else entry.setValue(val-1);
            }
            for(int rem:remove){
                map.remove(rem);
            }
        }
        return ans;
    }
}