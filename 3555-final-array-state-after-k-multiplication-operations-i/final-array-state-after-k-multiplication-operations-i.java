class Pair{
    int val;
    int idx;
    Pair(int val,int idx){
        this.val = val;
        this.idx = idx;
    }
}
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.val == b.val) return Integer.compare(a.idx,b.idx);
                return Integer.compare(a.val,b.val);
            }
        );
        
        for(int i=0;i<nums.length;i++){
            pq.offer(new Pair(nums[i],i));
        }

        for(int i=0;i<k;i++){
            Pair p = pq.poll();
            p.val = p.val * multiplier;
            pq.offer(p);
        }
        int[] res = new int[nums.length];
        for(Pair p : pq){
            res[p.idx] = p.val;
        }

        return res;
    }
}