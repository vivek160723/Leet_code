class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        int s = 1;
// find the lenght of the LL;
        while (fast.next != null) {
            fast = fast.next;
            s++;
        }
// iterate over the LL;
        for (int i=1;i<s-k%s;i++) {
            slow = slow.next;
        }
//now here do the shiftng ;
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}
