class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int[] freq = new int[k];
        for(int i=0;i<arr.length;i++){
            int rem = ((arr[i] % k) + k) % k;
            freq[rem]++;
        }

        if(freq[0] % 2 != 0){
            return false;
        }
        if(k%2==0 && freq[k/2]%2!=0){
            return false;
        }
        for(int i=1;i<k;i++){
            if(freq[i] != freq[k-i]){
                return false;
            }
        }

        return true;
    }
}