class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max_idx=-1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                max_idx = i;
            }
        }
        return max_idx;
    }
}