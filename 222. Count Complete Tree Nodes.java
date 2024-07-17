class Solution {
    public int countNodes(TreeNode root) {
          if (root == null)
            return 0;

        int gaurav = Height(root.left);
        int vivek = Height(root.right);
        if (vivek == gaurav) {
            return countNodes(root.right) + (1 << gaurav);
        }
        return countNodes(root.left) + (1 << vivek);
    }
    private int  Height(TreeNode node){
            int h=0;
            while(node!=null){
                h++;
                node=node.left;
            }
            return h;
        }
    }
    
