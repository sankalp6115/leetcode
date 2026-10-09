class Solution {
    public int arrangeCoins(int n) {
        long res = (long) (-1 + Math.sqrt(1 + (long) 8*n)) / 2;
        System.out.println(res);
        return (int) res;
    }
}