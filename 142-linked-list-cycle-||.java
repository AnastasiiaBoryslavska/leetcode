public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow){
        ListNode slow2 = head;
        while (slow != slow2){
	    slow2 = slow2.next;
	    slow = slow.next;
	     }
	    return slow;
	        }
        }
        return null;
    }
}