class Pair {
    int num, sum, index;

    Pair(int num, int index) {
        this.num = num;
        this.index = index;

        int s = 0;
        while (num > 0) {
            s += num % 10;
            num /= 10;
        }
        this.sum = s;
    }
}
class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        Pair[] arr = new Pair[n];
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            Pair pair = new Pair(nums[i],i);
            list.add(pair);
        }
        
        Collections.sort(list, (a,b) -> {
            if(a.sum == b.sum){
                return Integer.compare(a.num,b.num);
            }
            else{
                return Integer.compare(a.sum,b.sum);
            }
        });
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || list.get(i).index == i) {
                continue;
            }
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = list.get(j).index;
                cycleSize++;
            }
            swaps += cycleSize - 1;
        }
        return swaps;
    }
}