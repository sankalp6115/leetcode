class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int weight = 0;
        for(int i=0;i<n*n;i++){
            if(weight + w <= maxWeight){
                weight += w;
            }
        }
        return weight/w;
    }
}