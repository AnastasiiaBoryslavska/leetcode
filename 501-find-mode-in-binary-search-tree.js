/**
Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.

If the tree has more than one mode, return them in any order.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.
 */

/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var findMode = function(root) {
    var mode = [], 
        curNodeVal = NaN, 
        curNodeCount = 0, 
        maxCount = -Infinity;
    
    var inorder = function(root) {
        if (!root) return;
        inorder(root.left);
        curNodeCount = (root.val === curNodeVal ? curNodeCount : 0) + 1;
        curNodeVal = root.val;
        if (curNodeCount > maxCount) {
            mode = [root.val];
            maxCount = curNodeCount;
        } else if (curNodeCount === maxCount) {
            mode.push(root.val);
        }
        inorder(root.right);
    }
    inorder(root);
    return mode;
}
