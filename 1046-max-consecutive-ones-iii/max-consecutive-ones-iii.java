class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int ans=0;
        int n = nums.length;
        int[] freq = new int[2];
        for(int r=0;r<n;r++){
            freq[nums[r]] += 1;

            while(freq[0] > k){
                freq[nums[l]] -= 1;
                l++;
            }

            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}