class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int p1=0;
        int p2=0;
        int idx=0;
        while(p1 < m && p2 < n){
            if(nums1[p1] >= nums2[p2]){
                res[idx] = nums2[p2];
                idx++;
                p2++;
            }
            else{
                res[idx] = nums1[p1];
                idx++;
                p1++;
            }
        }
        while(p1 < m){
            res[idx] = nums1[p1];
            p1++;
            idx++;
        }
        while(p2 < n){
            res[idx] = nums2[p2];
            p2++;
            idx++;
        }
        for(int i=0;i<(m+n);i++){
            nums1[i] = res[i];
        }
    }
}