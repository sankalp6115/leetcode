class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        while(x != 0 || y != 0){
            int x_bit = x & 1;
            int y_bit = y & 1;
            count += (x_bit ^ y_bit);

            x = x >> 1;
            y = y >> 1;
        }
        return count;
    }
}