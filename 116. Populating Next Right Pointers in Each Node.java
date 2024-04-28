//===================iterative approach using queue===================
class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            Node prev=null;
        
        for(int i=0;i<size;i++){
            Node curr=queue.poll();
        
        if(prev!=null){
            prev.next=curr;
        }

        if(curr.left!=null){
            queue.offer(curr.left);
        }
         if(curr.right!=null){
            queue.offer(curr.right);
        }
              prev=curr;
        }
             prev.next=null;
        }
        return root;
}
}


//===================================Recusrsive approach============================

class Solution
{
  public Node connect (Node root)
  {
	if (root == null)
	  return null;
	if (root.left != null)
	  {
		root.left.next = root.right;
	  }
	if (root.right != null && root.next != null)
	  {
		root.right.next = root.next.left;
	  }
	connect (root.left);
	connect (root.right);
	return root;
  }
}







//
