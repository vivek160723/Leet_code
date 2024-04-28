class Solution {
    public ListNode sortList(ListNode head) {
        // Base case: if the list is empty or has only one node, it is already sorted
        if (head == null || head.next == null) {
            return head; 
        }

        ListNode middle = findMiddle(head);
        ListNode nextToMiddle = middle.next;
        middle.next = null;

        ListNode firstHalf = sortList(head); 
        ListNode secondHalf = sortList(nextToMiddle);

        return merge(firstHalf, secondHalf);
    }

    // Function to find the middle of the linked list
    public ListNode findMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Function to merge two sorted linked lists
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        // Append the remaining nodes
        if (l1 != null) {
            curr.next = l1;
        } else {
            curr.next = l2;
        }

        return dummy.next;
    }
}
