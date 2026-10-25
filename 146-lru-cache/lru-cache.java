class LRUCache {
    HashMap<Integer,Pair> map;
    int capacity;
    int time;

    class Pair{
        int timestamp;
        int val;
        public Pair(int timestamp,int val){
            this.timestamp = timestamp;
            this.val = val;
        }
    }
    public LRUCache(int capacity) {
        this.map = new HashMap<>(capacity);
        this.capacity = capacity;
        this.time = 0;
    }
    
    public int get(int key) {
        int res=-2;
        if(this.map.containsKey(key)){
            res = this.map.get(key).val;
            this.map.get(key).timestamp = this.time;
        }
        else{
            res = -1;
        }

        // System.out.println("CacheMap");
        // for(Map.Entry<Integer,Pair> entry:map.entrySet()){
        //     System.out.printf("%d %d %d\n", entry.getKey(),entry.getValue().timestamp,entry.getValue().val);
        // }

        // time flows
        this.time++;

        return res;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key,new Pair(this.time,value));
            this.time++;
            return;
        }
        
        if(map.size() == this.capacity){
            int minTime = Integer.MAX_VALUE;
            int oldestKey = Integer.MAX_VALUE;
            for(Map.Entry<Integer,Pair> entry:map.entrySet()){
                if(entry.getValue().timestamp < minTime){
                    minTime = entry.getValue().timestamp;
                    oldestKey = entry.getKey();
                }
            }
            map.remove(oldestKey);
        }

        // sure that key is not in map, need to put it
        map.put(key,new Pair(this.time,value));
        this.time++;
        

        // System.out.println("CacheMap");
        // for(Map.Entry<Integer,Pair> entry:map.entrySet()){
        //     System.out.printf("%d %d %d\n", entry.getKey(),entry.getValue().timestamp,entry.getValue().val);
        // }

        // time flows
        // this.time++;
        // return;
    }
}