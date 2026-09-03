class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int i:nums1){
            if(i % 2 == 1){
                minOdd = Math.min(minOdd,i);
            }
            else{
                minEven = Math.min(minEven,i);
            }
        }

        return minOdd == Integer.MAX_VALUE || minOdd < minEven;
    }
}