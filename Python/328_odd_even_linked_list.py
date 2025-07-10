#Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
#The first node is considered odd, and the second node is even, and so on.
#Note that the relative order inside both the even and odd groups should remain as it was in the input.
#You must solve the problem in O(1) extra space complexity and O(n) time complexity.

#Example 1:
#Input: head = [1,2,3,4,5]
#Output: [1,3,5,2,4]

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        odd = head
        even = head.next
        even_head = head.next
        while even is not None and even.next is not None:
            odd.next = odd.next.next
            odd = odd.next
            even.next = even.next.next
            even = even.next
        odd.next = even_head
        return head
    