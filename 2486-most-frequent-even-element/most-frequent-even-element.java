class Solution {
    class Pair{
        int val;
        int freq;
        Pair(int val,int freq){
            this.val = val;
            this.freq = freq;
        }
    }
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.freq == b.freq){
                return Integer.compare(a.val,b.val);
            }
            else{
                return Integer.compare(b.freq,a.freq);
            }
        });
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            Pair pair = new Pair(entry.getKey(),entry.getValue());
            pq.offer(pair);
        }

        System.out.println(map);
        for(Pair p:pq)System.out.print(p.val + " ");

        if(pq.isEmpty()){
            return -1;
        }
        else{
            return pq.peek().val;
        }
    }
}