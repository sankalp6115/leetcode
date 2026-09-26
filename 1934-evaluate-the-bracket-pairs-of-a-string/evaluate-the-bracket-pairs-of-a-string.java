class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            String key = knowledge.get(i).get(0);
            String value = knowledge.get(i).get(1);
            map.put(key,value);
        }

        StringBuilder sb = new StringBuilder();
        Queue<Character> st = new ArrayDeque<>();
        boolean putIntoStack = false;
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == '('){
                putIntoStack = true;
            }
            else if(s.charAt(i) == ')'){
                putIntoStack = false;
                StringBuilder word = new StringBuilder();
                while(!st.isEmpty()){
                    word.append(st.poll());
                }
                sb.append(map.getOrDefault(word.toString(),"?"));
            }
            else{
                if(putIntoStack){
                    st.offer(curr);
                }
                else{
                    sb.append(curr);
                }
            }
        }
        return sb.toString();
    }
}