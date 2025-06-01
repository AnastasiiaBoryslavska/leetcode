/**
 * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
 */

var reverseKGroup = function(head, k) {
    let dummy = new ListNode(0);
    dummy.next = head;
    let pointer = dummy;
    while(pointer != null) {
        let node = pointer;
        for(let i = 0; i < k && node != null; i++) {
            node = node.next;
        }
        if(node == null) break;

        let prev = null, curr = pointer.next, next = null;
        for(let i = 0; i < k; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        let tail = pointer.next;
        tail.next = curr;
        pointer.next = prev;
        pointer = tail;
    }
    return dummy.next;
    
};
