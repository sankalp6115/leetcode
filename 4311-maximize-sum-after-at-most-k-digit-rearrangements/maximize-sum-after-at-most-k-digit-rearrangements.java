class Pair{
    int val;
    int gain;
    int idx;
    Pair(int val,int idx){
        this.val = val;
        this.gain = maxNum(this.val) - this.val;
        this.idx = idx;
    }

    public int maxNum(int num){
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits)).reverse();
        int result = Integer.parseInt(sb.toString());
        return result;
    }
}
class Solution {
    public long maximizeSum(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.gain == b.gain){
                return Integer.compare(b.val,a.val);
            }
            else{
                return Integer.compare(b.gain,a.gain);
            }
        });

        for(int i=0;i<n;i++){
            pq.offer(new Pair(nums[i],i));
        }

        for(int i=0;i<k;i++){
            Pair p = pq.poll();
            nums[p.idx] = p.val + p.gain;
        }

        long res=0;

        for(int i:nums) res += i;
        return res;
    }
}