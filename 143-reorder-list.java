/*
 * You are given the head of a singly linked-list. The list can be represented as:
 * L0 → L1 → … → Ln - 1 → Ln
 * Reorder the list to be on the following form:
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head.next == null) return;
        //find the middle of the list using fast and slow pointers
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next; //fix the start of the second half of the list
        slow.next = null; //break the connection(pointer)

        //reverse the second part of the list
        ListNode p = mid; 
        ListNode q = mid.next; //pointer to the next node, because we will lose connection to it while reversing
        ListNode pp = null; //will use it as pointter to p pointer;
        ListNode qq = null; //will use it as pointer to q pointer;
        mid.next = null; //points to null because the mid gonna be the last node after reversing
        while(q != null){
            pp = p; //points to p
            p = q; //swap with next node;
            q = q.next; // move this pointer to next node to save it;
            p.next = pp; // create a pointer to previously swapped node ( reverse the pointer)
        }
        mid = p; // save the position of the p node (at this moment it is at the end of the list)]

        //merge the first part and the second reversed part;
        p = head; //points to the start of the list
        q = mid; //points to the end of the list;
        while( q != null) {
            pp = p; //points to head
            qq = q; //points to the end
            p = p.next; //move pointer forward;
            q = q.next; //move pointer closer from the end of the list;
            pp.next = qq; //create a connection between node from the start and node from the end;
            qq.next = p; //create a connection with the next node from the start;
        }
    }
}
