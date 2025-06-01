// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

// The first node is considered odd, and the second node is even, and so on.

// Note that the relative order inside both the even and odd groups should remain as it was in the input.

// You must solve the problem in O(1) extra space complexity and O(n) time complexity.

class Solution {
    public ListNode oddEvenList(ListNode head) {
        //base case
        if(head == null || head.next == null) return head;

        ListNode odd = head, even = head.next, evenHead = head.next;

        while(even != null && even.next != null) {
            odd.next = odd.next.next; //move pointer(next) to next odd node
            even.next = even.next.next; //move pointer(next) to next even node;
            odd = odd.next; //move odd to next odd node;
            even = even.next; //move even to next even node
        }
        odd.next = evenHead; //connect last odd node with first even node
        return head; //return head of the linked list;
    }  
}