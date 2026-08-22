class Solution {
    public void inorder(TreeNode root,List<Integer> normalList,List<Integer> sortedList){
        if(root == null) return;
        inorder(root.left,normalList,sortedList);
        normalList.add(root.val);
        sortedList.add(root.val);
        inorder(root.right,normalList,sortedList);
    }
    public void replace(TreeNode root,int diff1,int diff2){
        if(root == null) return;
        replace(root.left,diff1,diff2);
        if(root.val == diff2){
            root.val = diff1;
        }
        else if(root.val == diff1){
            root.val = diff2;
        }
        replace(root.right,diff1,diff2);
    }
    public void recoverTree(TreeNode root) {
        List<Integer> normal = new ArrayList<>();
        List<Integer> sorted = new ArrayList<>();
        inorder(root,normal,sorted);
        Collections.sort(sorted);

        int diff1=0;
        int diff2=0;
        for(int i=0;i<normal.size();i++){
            if(!normal.get(i).equals(sorted.get(i))){
                diff1 = normal.get(i);
                diff2 = sorted.get(i);
                break;
            }
        }
        replace(root,diff1,diff2);
    }
}