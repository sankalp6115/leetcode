class Solution {
    int cnt = 0;
    long num = 0;

    public String getHappyString(int n, int k) {
        cnt = 0;
        if (3 * (n == 1 ? 1 : Math.pow(2, n - 1)) < k) {
            return "";
        }
        var arr = new long[]{1, 2, 3};
        var chs = new char[] {'a', 'b', 'c'};
        backtrack(n, k, arr, 0, 0);
        var sb = new StringBuilder();
        while (num > 0) {
            sb.insert(0, chs[Math.toIntExact((num % 10) - 1)]);
            num /= 10;
        }
        return sb.toString();
    }

    private void backtrack(int n, int k, long[] arr, long str, int len) {
        if (cnt >= k) {
            return;
        }
        if (n == len) {
            if (++cnt == k) {
                num = str;
            }
        } else {
            var idx = arr[0] == str % 10 ? 1 : 0;
            for (int i = idx; i < arr.length; i++) {
                if (arr[i] != str % 10) {
                    backtrack(n, k, arr, str * 10 + arr[i],len + 1);
                }
            }
        }
    }
}