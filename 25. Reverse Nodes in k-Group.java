class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null|| k<=1){
            return head;
        }

        ListNode curr=head;
        int count=0;
        while(curr!=null&&count!=k){
            curr=curr.next;
            count++;
        }

        if(count==k){
            curr=reverseKGroup(curr,k);
            while(count-->0){
                ListNode next=head.next;
                head.next=curr;
                curr=head;
                head=next;
            }
            head=curr;
        }
        return head;
    }
}
