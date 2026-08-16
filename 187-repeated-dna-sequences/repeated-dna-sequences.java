class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        if(s.length() < 10){
            return list;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10;i++){
            sb.append(s.charAt(i));
            map.put(sb.toString(),1);
        }
        for(int i=10;i<s.length();i++){
            sb.append(s.charAt(i));
            sb.deleteCharAt(0);

            String str = new String(sb.toString());
            map.put(str,map.getOrDefault(str,0) + 1);
        }

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue() > 1){
                list.add(entry.getKey());
            }
        }

        return list;
    }
}