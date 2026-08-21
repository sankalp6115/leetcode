class Solution {
    public List<String> bfs(TreeNode root){
        List<String> list = new ArrayList<>();
        if(root == null) return list;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode peek = q.poll();
            if(peek == null){
                list.add("null");
                continue;
            }
            list.add(String.valueOf(peek.val));
            q.offer(peek.left);
            q.offer(peek.right);
        }
        while (!list.isEmpty() && list.get(list.size() - 1).equals("null")) {
            list.remove(list.size() - 1);
        }

        return list;
    }
    public boolean isCompleteTree(TreeNode root) {
        List<String> list = bfs(root);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            if(i != list.size()-1 && list.get(i) == "null"){
                return false;
            }
        }
        return true;
    }
}