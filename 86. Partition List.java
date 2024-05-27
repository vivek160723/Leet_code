class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode list1=new ListNode(0);
        ListNode list2=new ListNode(0);

        ListNode ptr1=list1;
        ListNode ptr2=list2;

        while(head!=null){
            if(head.val<x){
                ptr1.next=head;
                ptr1=ptr1.next;
            }else{
                ptr2.next=head;
                ptr2=ptr2.next;
            }
            head=head.next;
        }
        ptr1.next=list2.next;
        ptr2.next=null;

        return list1.next;
    }
}
