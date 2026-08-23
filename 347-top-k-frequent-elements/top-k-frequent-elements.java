class Solution {
    public class Pair{
        int val;
        int freq;
        Pair(int val,int freq){
            this.val = val;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            return a.freq - b.freq;
        });
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            Pair pair = new Pair(entry.getKey(),entry.getValue());
            pq.offer(pair);
            if(pq.size() > k){
                pq.poll();
            }
        }

        List<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll().val);
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}