class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int l=0;
        int r=n-1;
        int res=-1;
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid] < arr[mid+1]){
                l = mid + 1;
            }
            else{
                res = mid;
                r = mid - 1;
            }
        }
        return res;
    }
}