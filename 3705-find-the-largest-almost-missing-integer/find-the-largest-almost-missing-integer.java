class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int l = 0; l + k <= n; l++) {
            HashSet<Integer> set = new HashSet<>();

            for (int i = l; i < l + k; i++) {
                set.add(nums[i]);
            }

            for (int num : set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int ans = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans = Math.max(ans, entry.getKey());
            }
        }

        return ans;
    }
}