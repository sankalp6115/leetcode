class Solution {
    public int maxDistance(String moves) {
        int vertical = 0;
        int horizontal = 0;
        int under = 0;
        for(int i=0;i<moves.length();i++){
            char curr = moves.charAt(i);
            if(curr == 'U') vertical++;
            else if(curr == 'D') vertical--;
            else if(curr == 'L') horizontal--;
            else if(curr == 'R') horizontal++;
            else under++;
        }

        return Math.abs(vertical) + Math.abs(horizontal) + under;
    }
}