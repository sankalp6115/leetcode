class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int weight = 0;
        if(n*n*w < maxWeight){
            return n*n;
        }
        else{
            for(int i=0;i<n*n;i++){
                if(weight + w <= maxWeight){
                    weight += w;
                }
            }
        }
        return weight/w;
    }
}