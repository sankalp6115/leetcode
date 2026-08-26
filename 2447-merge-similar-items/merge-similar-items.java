class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] ans = new int[1001];
        for(int i=0;i<items1.length;i++){
            ans[items1[i][0]] = items1[i][1];
        }
        for(int i=0;i<items2.length;i++){
            ans[items2[i][0]] += items2[i][1];
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<1001;i++){
            List<Integer> list = new ArrayList<>();
            if(ans[i] != 0){
                list.add(i);
                list.add(ans[i]);
                res.add(list);
            }
        }
        return res;
    }
}