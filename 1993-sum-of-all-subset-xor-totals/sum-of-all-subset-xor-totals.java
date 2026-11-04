class Solution {
    public int sum(List<List<Integer>> res){
        int ans = 0;
        for(List<Integer> i:res){
            int temp=0;
            for(int j:i){
                temp = temp ^ j;
            }
            ans += temp;
        }
        return ans;
    }
    public void subset(List<List<Integer>> res,List<Integer> list,int[] arr,int idx){
        if(idx == arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[idx]);
        subset(res,list,arr,idx+1);
        list.remove(list.size()-1);
        subset(res,list,arr,idx+1);
    }
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subset(res,list,nums,0);
        return sum(res);
    }
}