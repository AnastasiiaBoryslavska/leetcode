// Given the root of a binary tree, return the preorder traversal of its nodes' values.

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        //create a list to store the traversal result
        List<Integer> result = new ArrayList<>();

        //call the helper method
        traversal(root, result);

        //return the result
        return result;
    }

    public void traversal(TreeNode root, List<Integer> result) {
        //base case
        if(root == null) return;

        //add the current node's value to the result list
        result.add(root.val);

        //recursively traverse the left and right subtrees
        traversal(root.left, result);
        traversal(root.right, result);
    }
}
