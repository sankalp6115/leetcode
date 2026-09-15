class Solution {
    public int first(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        int res=-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                res = mid;
                r=mid-1;
            }
            else if(arr[mid] < target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return res;
    }
    public int last(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        int res=-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                res = mid;
                l=mid+1;
            }
            else if(arr[mid] < target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        res[0] = first(nums,target);
        res[1] = last(nums,target);
        return res;
    }
}