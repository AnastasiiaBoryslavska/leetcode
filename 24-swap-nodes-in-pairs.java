/**
 * Given a linked list, swap every two adjacent nodes and return its head. 
 * You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 * Example 1:
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 */

 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
     ListNode dummy = new ListNode(0);
     dummy.next = head;
     ListNode current = dummy;
     while (current.next != null && current.next.next != null) {
         ListNode first = current.next;
         ListNode second = current.next.next;
         first.next = second.next;
         current.next = second;
         current.next.next = first;
         current = current.next.next;
     }
     return dummy.next;
 }
 }
 