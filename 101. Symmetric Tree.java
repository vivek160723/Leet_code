class Solution {
   public boolean mirrorTree(TreeNode leftroot,TreeNode rightroot){
    if (leftroot == null && rightroot==null){
        return true;
    }
    if((leftroot != null && rightroot == null) || (leftroot==null &&rightroot!=null)){
        return false;
    }
    if(leftroot.val!=rightroot.val){
        return false;
    }
    return mirrorTree(leftroot.left,rightroot.right) && mirrorTree(leftroot.right,rightroot.left);
   }
    public boolean isSymmetric(TreeNode root) {
       return mirrorTree(root.left,root.right);
    }
}
