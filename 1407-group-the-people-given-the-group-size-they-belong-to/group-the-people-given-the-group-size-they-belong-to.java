class Solution {
    public List<List<Integer>> groupThePeople(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }
            else{
                map.put(nums[i], new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }

        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
            List<Integer> list = new ArrayList<>();
            int groupSize = entry.getKey();
            int people = entry.getValue().size();
            if(people == groupSize){
                for(int person:entry.getValue()){
                    list.add(person);
                }
                res.add(new ArrayList<>(list));
                list.clear();
            }
            else{
                int idx=0;
                for(int i=0;i<(people/groupSize);i++){
                    while(idx < people){
                        list.add(entry.getValue().get(idx));
                        idx++;
                        if(list.size() == groupSize) break;
                    }
                    res.add(new ArrayList<>(list));
                    list.clear();
                }
            }
        }
        return res;
    }
}