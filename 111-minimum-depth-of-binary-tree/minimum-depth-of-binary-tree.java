class Solution {
    int ans = Integer.MAX_VALUE;
    public void helper(TreeNode root,int depth){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            ans = Math.min(ans,depth);
            return;
        }
        helper(root.left,depth+1);
        helper(root.right,depth+1);
    }
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        helper(root,1);
        return ans;
    }
}