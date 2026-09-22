class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(score[i],i);
        }
        for(int i:score) pq.offer(i);

        // System.out.println(map);
        // System.out.println(pq);

        String[] res = new String[n];
        for(int i=0;i<n;i++){
            int x = pq.poll();
            if(i == 0) res[map.get(x)] = "Gold Medal";
            else if(i == 2) res[map.get(x)] = "Bronze Medal";
            else if(i == 1) res[map.get(x)] = "Silver Medal";
            else res[map.get(x)] = String.valueOf(i+1);
        }
        return res;
    }
}