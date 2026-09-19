class Solution {
    public double distance(int[] center,int[] point){
        double dist = Math.pow((center[0] - point[0]) * (center[0] - point[0]) + (center[1] - point[1]) * (center[1] - point[1]),0.5);
        return dist;
    }

    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closest_x = Math.max(x1,Math.min(xCenter,x2));
        int closest_y = Math.max(y1,Math.min(yCenter,y2));

        int dx = xCenter - closest_x;
        int dy = yCenter - closest_y;
        return ((dx * dx) + (dy * dy)) <= (radius * radius);
    }
}