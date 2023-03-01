/*
Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

*/

var sumOfLeftLeaves = function(root, left = false) {
    if(root == null) return 0;
    if(root.left == null && root.right == null) return left ? root.val : 0;
    return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right);
}