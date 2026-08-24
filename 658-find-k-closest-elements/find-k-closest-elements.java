class Solution {
    class Pair {
        int val;
        int diff;

        Pair(int val, int diff) {
            this.val = val;
            this.diff = diff;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.diff == b.diff) {
                return Integer.compare(b.val, a.val);
            }
            return Integer.compare(b.diff, a.diff);
        });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Pair pair = new Pair(
                entry.getKey(),
                Math.abs(x - entry.getKey())
            );

            for (int i = 0; i < entry.getValue(); i++) {
                pq.offer(pair);
            }

            while (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll().val);
        }

        Collections.sort(ans);
        return ans;
    }
}