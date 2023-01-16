/*
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */

 class Solution {
    List<Integer> res = new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        //base case
        if(root == null) return;

        //traverse the left side
        dfs(root.left);

        //add curret node's value to the lsit
        res.add(root.val);

        //traverse the right side
        dfs(root.right);
    }
  }