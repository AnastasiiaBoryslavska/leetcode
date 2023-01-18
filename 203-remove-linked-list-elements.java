/*
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list
 * that has Node.val == val, and return the new head.
 */

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //base case
        if(head == null) {
            return null;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = head;
        ListNode prev = dummy;

        while(cur != null) {
            if(cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}