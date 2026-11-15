class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        long res = 0;
        int prefixSum = 0;
        int evenCount = 1; 
        int oddCount = 0;

        for (int num : arr) {
            prefixSum += num;
            if (prefixSum % 2 == 0) {
                res += oddCount;
                evenCount++;
            } else {
                res += evenCount;
                oddCount++;
            }
        }

        return (int) (res % mod);
    }
}
