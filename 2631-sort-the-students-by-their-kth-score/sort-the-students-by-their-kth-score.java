class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Integer[] indices = new Integer[score.length];

        for (int i = 0; i < score.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> 
            Integer.compare(score[b][k], score[a][k])
        );

        int[][] ans = new int[score.length][];

        for (int i = 0; i < score.length; i++) {
            ans[i] = score[indices[i]];
        }

        return ans;
    }
}