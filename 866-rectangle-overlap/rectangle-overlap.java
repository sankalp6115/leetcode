class Solution {
    public boolean overlap(int[] a,int[] b){
        return (a[0] < b[1] && b[0] < a[1]);
    }
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean horizontal = false;
        boolean vertical = false;
        
        int[] rec_1_hori = new int[]{rec1[0],rec1[2]};
        int[] rec_1_vert = new int[]{rec1[1],rec1[3]};
        int[] rec_2_hori = new int[]{rec2[0],rec2[2]};
        int[] rec_2_vert = new int[]{rec2[1],rec2[3]};

        if(overlap(rec_1_vert,rec_2_vert)){
            vertical = true;
        }
        if(overlap(rec_1_hori,rec_2_hori)){
            horizontal = true;
        }
        return vertical && horizontal;
    }
}