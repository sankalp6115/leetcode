class Solution {
        private long power(long x, long y, long mod) {
        long result = 1;
        x %= mod;
        while (y > 0) {
            if ((y & 1) == 1) {
                result = result * x % mod;
            }
            x = x * x % mod;
            y >>= 1;
        }
            return result;
        }
        public int sumDecoded(long[] nums) {
        final long MOD = 1_000_000_007L;
        long sum = 0;

        for (long num : nums) {
            int width = (int) (num % 10);
            long d = num / 10;

            String s = String.valueOf(d);

            long x = Long.parseLong(s.substring(0, width));
            long y = Long.parseLong(s.substring(width));

            sum = (sum + power(x, y, MOD)) % MOD;
        }

        return (int) sum;
    }
}