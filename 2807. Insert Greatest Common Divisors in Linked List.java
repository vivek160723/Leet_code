// First create a helper method to calculate the gcd of two numbers.
// Check if given Linked List has only one node then return head.
// Create two pointer to keep track of of two nodes of linked list at a time.
// p1 = head; p2 = head.next
// Run while loop while p2 is not null.
// Create a newNode with value as a gcd of two numbers which are p1.val and p2.val.
// Now insert this newNode between p1 and p2 nodes.
class Solution {
    
    public int getGCD(int a, int b){
        while(a != 0) {
            int res = a;
            a = b%a;
            b = res;
        }
        return b;
    }
    
    public ListNode insertGreatestCommonDivisors(ListNode head) {
      
        if(head.next == null) return head;

       
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2 != null) {
         
            ListNode newNode= new ListNode(getGCD(p1.val, p2.val));
            
          
            p1.next = newNode;
            newNode.next = p2;

           
            p1 = p2;
            p2 = p2.next;
        }

        return head;
    }
}
