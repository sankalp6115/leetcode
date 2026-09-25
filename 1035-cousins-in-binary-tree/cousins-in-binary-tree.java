class Solution {
    public int[] depth(TreeNode root, int target, int depth){
        if(root == null) return new int[]{-1,-1};
        if(root.left != null && root.left.val == target) return new int[]{depth,root.val};
        if(root.right != null && root.right.val == target) return new int[]{depth,root.val};

        int[] left = depth(root.left,target,depth+1);
        if(left[0] != -1 && left[1] != -1) return left;
        return depth(root.right,target,depth+1);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] xDepth=depth(root,x,0);
        int[] yDepth=depth(root,y,0);
        return xDepth[1] != yDepth[1] && xDepth[0] == yDepth[0];
    }
}