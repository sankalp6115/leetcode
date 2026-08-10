class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int r=0;
        while(l < g.length && r < s.length){
            if(g[l] <= s[r]){
                res++;
                l++; 
                r++;
            }
            else{
                r++;
            }
        }
        return res;
    }
}