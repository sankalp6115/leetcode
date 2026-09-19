class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (row1,row2) -> Integer.compare(row1[0],row2[0]));
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if(end1 >= start2){
                start1 = start1;
                end1 = Math.max(end1,end2);
                continue;
            }

            ans.add(Arrays.asList(start1,end1));
            start1 = start2;
            end1 = end2;
        }
        ans.add(Arrays.asList(start1,end1));
        int[][] ansArray = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            int[] arr = new int[]{ans.get(i).get(0),ans.get(i).get(1)};
            ansArray[i] = arr;
        }
        return ansArray;
    }
}