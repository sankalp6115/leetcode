class Solution {
    public long countCommas(long n) {
        long res = 0;

        if (n >= 1_000)
            res += n - 999;

        if (n >= 1_000_000)
            res += (n - 999_999) * 1;

        if (n >= 1_000_000_000)
            res += (n - 999_999_999) * 1;

        if (n >= 1_000_000_000_000L)
            res += (n - 999_999_999_999L) * 1;

        if (n >= 1_000_000_000_000_000L)
            res += 1;

        return res;
    }
}