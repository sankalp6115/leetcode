class Solution {
    public int bsFirst(int[] arr,int target){
        int n = arr.length;
        int l=0;
        int r=n-1;
        int ans = -1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(arr[mid] == target){
                r = mid-1;
                ans = mid;
            }
            else if(arr[mid] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return ans;
    }
    public int bsLast(int[] arr,int target){
        int n = arr.length;
        int l=0;
        int r=n-1;
        int ans = -1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(arr[mid] == target){
                l = mid + 1;
                ans = mid;
            }
            else if(arr[mid] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{bsFirst(nums,target), bsLast(nums,target)};
    }
}