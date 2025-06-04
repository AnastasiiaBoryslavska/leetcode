/*
Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

*/

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, false);
    }

    private int helper(TreeNode root, boolean isLeft) {
        if(root == null) return 0;
        if(root.left == null && root.right == null && isLeft) return root.val;

        return helper(root.left, true) + helper(root.right, false);
    }
}
