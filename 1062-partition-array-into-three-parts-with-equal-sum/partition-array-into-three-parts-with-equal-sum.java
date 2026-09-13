class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        int n = arr.length;
        
        total += arr[0];
        for(int i=1;i<n;i++){
            total += arr[i];
        }

        if(total % 3 != 0){
            return false;
        }
        int target = total/3;
        int sum=0;
        int part=0;

        for(int i=0;i<n-1;i++){
            sum += arr[i];
            if(sum == target){
                part++;
                sum=0;
            }
            if(part == 2){
                return true;
            }
        }

        return false;
    }
}