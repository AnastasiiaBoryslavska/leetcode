/*
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.


Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
 */

var mergeKLists = function(lists) {
    let nodes = [];
    let point = new ListNode(0);
    let head = point;
    lists.forEach(e => {
        while(e) {
            nodes.push(e.val);
            e = e.next;
        }
    })

    nodes.sort((a, b) => a - b);
    nodes.forEach(e => {
        point.next = new ListNode(e);
        point = point.next;
    })
    return head.next;
};
