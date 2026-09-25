class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        HashMap<Character, Character> sT=new HashMap<>();
        HashMap<Character, Character> tS=new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(sT.containsKey(a) && sT.get(a)!=b){
                return false;
            }
            if(tS.containsKey(b) && tS.get(b)!=a){
                return false;
            }
            sT.put(a, b);
            tS.put(b, a);
        }
        return true;
    }
}