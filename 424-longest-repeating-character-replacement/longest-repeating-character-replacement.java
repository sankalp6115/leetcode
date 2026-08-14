class Solution {
    public int max(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
        int l=0;
        int max_ans=0;
        int n = s.length();
        int[] freq = new int[26];
        for(int r=0;r<n;r++){
            freq[s.charAt(r) - 'A']++;
            int maxFreq = max(freq);
            while(((r - l + 1) - maxFreq) > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            max_ans = Math.max(max_ans, r-l+1);
        }
        return max_ans;
    }
}