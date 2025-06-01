/*
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;  //initialize slow and fast pointers;
        ListNode fast = head;

        for(int i = 0; i < n; i++) {  //we need to place fast pointer at the distance of n node
            fast = fast.next;
        }

        if(fast == null) { //in case if the n is the same length as n and we need to remove the first node
            return head.next;  //we can just return head.next (as first node supposes to be removed)
        }

        while(fast.next != null) {
            slow = slow.next;  //just move pointers and when the condition is false, the slow pointer will be at nth node
            fast = fast.next;
        }

        slow.next = slow.next.next; // new connection to the node after n node (basically, just deleting the nth node)
        return head;
    }
}