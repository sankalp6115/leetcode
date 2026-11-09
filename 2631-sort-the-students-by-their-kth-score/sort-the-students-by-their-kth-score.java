class Pair{
    int idx;
    List<Integer> marks;

    Pair(int idx,List<Integer> marks){
        this.idx = idx;
        this.marks = marks;
    }
}
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        List<Pair> list = new ArrayList<>();
        int n = score.length;
        int m = score[0].length;
        for(int i=0;i<n;i++){
            List<Integer> marks = new ArrayList<>();
            for(int j=0;j<m;j++){
                marks.add(score[i][j]);
            }
            Pair pair = new Pair(i,marks);
            list.add(pair);
        }

        Collections.sort(list, (a,b) -> Integer.compare(b.marks.get(k),a.marks.get(k)));

        for(int i=0;i<n;i++){
            Pair p = list.get(i);
            for(int j=0;j<m;j++){
                score[i][j] = p.marks.get(j);
            }
        }
        return score;
    }
}