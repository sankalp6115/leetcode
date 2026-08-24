class Solution {
    class Pair{
        int val;
        int diff;
        int freq;
        Pair(int val,int diff,int freq){
            this.val = val;
            this.diff = diff;
            this.freq = freq;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.diff == b.diff){
                return Integer.compare(b.val,a.val);
            }
            else{
                return Integer.compare(b.diff,a.diff);
            }
        });

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            Pair pair = new Pair(entry.getKey(),Math.abs(x - entry.getKey()),entry.getValue());
            for(int i=0;i<entry.getValue();i++){
                pq.offer(pair);
            }
            while(pq.size() > k){
                pq.poll();
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(Pair p:pq){
            ans.add(p.val);
        }

        Collections.sort(ans);
        return ans;
    }
}