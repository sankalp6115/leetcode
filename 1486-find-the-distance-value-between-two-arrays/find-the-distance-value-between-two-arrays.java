class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int res=0;
        for(int i=0;i<arr1.length;i++){
            int idx = Arrays.binarySearch(arr2, arr1[i] - d);
            if(idx < 0) idx = -(idx+1);
            if (idx < arr2.length && arr2[idx] <= arr1[i] + d) {
                continue;
            }
            res++;
        }
        return res;
    }
}