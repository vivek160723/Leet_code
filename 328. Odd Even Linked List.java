class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return head;
// i dont this code using two pointer very easy approach!!
        ListNode odd=head;
        ListNode even=head.next;
        ListNode temp=even;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=temp;
    
    return head;
    }
}
