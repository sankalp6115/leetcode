class Solution {
    public void helper(TreeNode root,int k,List<Integer> list){
        if(root == null) return;
        helper(root.left,k,list);
        list.add(root.val);
        if(list.size() == k) return;
        helper(root.right,k,list);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        helper(root,k,list);
        return list.get(k-1); 
    }
}