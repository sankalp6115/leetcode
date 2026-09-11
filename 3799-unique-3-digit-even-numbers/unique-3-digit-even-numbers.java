class Solution {
    int res=0;
    public void helper(int[] arr,boolean[] used,int num,int chosen,Set<Integer> set){
        if(chosen == 3){
            if(num % 2 == 0 && num >= 100){
                set.add(num);
            }
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]) continue;
            if(chosen == 0 && arr[i] == 0) continue;

            used[i] = true;
            helper(arr,used,num*10+arr[i],chosen+1,set);
            used[i] = false;
        }
    }
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        helper(digits,new boolean[digits.length],0,0,set);
        return set.size();
    }
}