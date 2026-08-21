class Solution {
    int ans = 0;
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public int diameter(TreeNode root){
        if(root == null) return 0;
        return height(root.left) + height(root.right);
    }
    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        int dia = diameter(root);
        ans = Math.max(ans,dia);
        helper(root.right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        helper(root);
        return ans;
    }
}