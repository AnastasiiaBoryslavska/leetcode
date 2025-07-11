#Given the head of a singly linked list, reverse the list, and return the reversed list.
#Input: head = [1,2,3,4,5]
#Output: [5,4,3,2,1]

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head

        while curr is not None :
            next_node = curr.next

            curr.next = prev

            prev = curr
            curr = next_node
        
        return prev
