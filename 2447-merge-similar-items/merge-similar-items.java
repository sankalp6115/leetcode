class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<items1.length;i++){
            map.put(items1[i][0],items1[i][1]);
        }
        for(int i=0;i<items2.length;i++){
            map.put(items2[i][0],map.getOrDefault(items2[i][0],0)+items2[i][1]);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            List<Integer> list = new ArrayList<>();
            list.add(entry.getKey());
            list.add(entry.getValue());
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}