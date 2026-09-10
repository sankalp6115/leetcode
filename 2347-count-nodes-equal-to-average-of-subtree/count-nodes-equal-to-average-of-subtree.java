class Solution {
    int count=0;

    public int sum(TreeNode root){
        if(root == null) return 0;
        return sum(root.left) + sum(root.right) + root.val;
    }
    public int n(TreeNode root){
        if(root == null) return 0;
        return 1 + n(root.left) + n(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        if(root == null) return 0;
        int avg = sum(root)/n(root);
        if(avg == root.val) count++;
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return count;

    }
}