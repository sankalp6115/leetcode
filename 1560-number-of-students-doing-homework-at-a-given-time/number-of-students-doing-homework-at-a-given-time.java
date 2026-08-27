class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n = startTime.length;
        int count=0;
        int[][] interval = new int[n][2];
        for(int i=0;i<n;i++){
            int[] part = new int[]{startTime[i],endTime[i]};
            interval[i] = part;
        }
        for(int i=0;i<n;i++){
            if(interval[i][0] <= queryTime && queryTime <= interval[i][1]){
                count++;
            }
        }
        return count;
    }
}