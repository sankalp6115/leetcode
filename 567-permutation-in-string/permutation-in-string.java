class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int m = s1.length();
        int n = s2.length();

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0;i<m;i++){
            char curr = s1.charAt(i);
            map1.put(curr,map1.getOrDefault(curr,0)+1);
        }

        for(int i=0;i<m;i++){
            char curr = s2.charAt(i);
            map2.put(curr,map2.getOrDefault(curr,0)+1);
        }

        if(map1.equals(map2)) return true;

        for(int i=m;i<n;i++){
            char last = s2.charAt(i-m);
            char curr = s2.charAt(i);
            map2.put(last,map2.get(last)-1);
            if(map2.get(last) == 0) map2.remove(last);
            map2.put(curr,map2.getOrDefault(curr,0)+1);
            if(map1.equals(map2)) return true;
        }

        return false;
    }
}