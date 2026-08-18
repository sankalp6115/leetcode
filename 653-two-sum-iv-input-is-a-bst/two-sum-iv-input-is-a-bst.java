class Solution {
    public boolean helper(TreeNode root, int k, HashSet<Integer> set){
        if(root == null) return false;
        int complement = k - root.val;
        if(set.contains(complement)){
            return true;
        }
        set.add(root.val);
        return helper(root.left,k,set) || helper(root.right,k,set);        
    }
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root,k,set);
    }
}