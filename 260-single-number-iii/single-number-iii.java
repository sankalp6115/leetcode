class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] res = new int[2];
        res[0] = -1; res[1] = -1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                if(res[0] == -1){
                    res[0] = entry.getKey();
                }
                else{
                    res[1] = entry.getKey();
                }
            }
        }
        return res;
    }
}