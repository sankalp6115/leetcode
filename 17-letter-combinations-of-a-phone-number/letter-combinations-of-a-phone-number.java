class Solution {
    public void helper(String stage,int n,int idx,StringBuilder s,List<String> list,Map<Character,String> map) {
        if(idx == n){
            list.add(s.toString());
            return;
        }
        String choice = map.get(stage.charAt(idx));
        for(int j=0;j<choice.length();j++){
            s.append(choice.charAt(j));
            helper(stage,n,idx+1,s,list,map);
            s.deleteCharAt(s.length()-1);
        }
        return;

    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(digits,digits.length(),0,sb,list,map);
        return list;
    }
}