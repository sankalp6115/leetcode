class Solution {
    public boolean lemonadeChange(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(5,0);
        map.put(10,0);
        map.put(20,0);
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            System.out.println(map);
            if(nums[i] == 5){
                continue;
            }
            else if(nums[i] == 10){
                if(map.get(5) > 0){
                    map.put(5,map.get(5)-1);
                }
                else{
                    return false;
                }
            }
            else{
                if(map.get(10) > 0 && map.get(5) > 0){
                    map.put(5,map.get(5) - 1);
                    map.put(10,map.get(10) - 1);
                }
                else if(map.get(5) >= 3){
                    map.put(5,map.get(5) - 3);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}