class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums) pq.offer(Math.abs(i));
        
        for(int i=1;i<n;i+=2){
            nums[i] = pq.poll();
        }

        for(int i=0;i<n;i+=2){
            nums[i] = pq.poll();
        }
        
        long sum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum += (nums[i]*nums[i]);
            }
            else{
                sum -= (nums[i]*nums[i]);
            }
        }
        return sum;
    }
}