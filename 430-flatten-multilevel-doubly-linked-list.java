/*You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer, and an additional child pointer.
This child pointer may or may not point to a separate doubly linked list, also containing these special nodes.
These child lists may have one or more children of their own, and so on, to produce a multilevel data structure as shown in the example below.

Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level, doubly linked list.
Let curr be a node with a child list. The nodes in the child list should appear after curr and before curr.next in the flattened list.

Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null.
 
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
 */

class Solution {
    public Node flatten(Node head) {
        Node curr = head;
        recursive(curr);
        return head;
    }

    Node recursive(Node node) {
        Node prev = node;
        while(node != null) {
            prev = node;
        

        //Continue iterating if there is no child
        if(node.child == null) {
            node = node.next;
            continue;
        }

        //At this point current node is a child
        Node next = node.next; //save the next node for backtrack
        node.next = node.child; //point curent node's 'next' pointer to child node
        node.child.prev = node; //update the prev pointer of child node;

        //Recurse over the child node
        Node rec = recursive(node.child);
        node.child = null; 

        if(next != null) {
            rec.next = next;
            next.prev = rec;
            node = next;
        } else {
            node = rec;
        }
      }
    return prev;
  }
}
