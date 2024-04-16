
class Solution {
    public Node copyRandomList(Node head) {
        Node curr=head;
        while(curr!=null){
            Node copy=new Node(curr.val);
            copy.next=curr.next;
            curr.next=copy;
            curr=copy.next;
        }

        curr=head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }

            curr=curr.next.next;
        }
        Node dummy=new Node(0);
        Node newcurr=dummy;
        curr=head;
        while(curr!=null){
            newcurr.next=curr.next;
            newcurr=newcurr.next;
            curr.next=curr.next.next;
            curr=curr.next;
          }
    return dummy.next;
    }

}
