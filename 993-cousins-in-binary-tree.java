/**
Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.

Two nodes of a binary tree are cousins if they have the same depth with different parents.

Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
    Queue<TreeNode> queue = new LinkedList<>();
    if(root == null) return false;
    queue.add(root);
    int depthY = -1;
    int depthX = -2;
    int level = 0;
    while(!queue.isEmpty()){
        int size = queue.size();
        for(int i = 0 ; i < size ; i++){
            TreeNode node = queue.remove();
            if(node.left != null && node.right != null){
                if(node.left.val == x && node.right.val == y) return false;
                if(node.left.val == y && node.right.val == x) return false;
            }
            if(node.val == x) depthX = level;
            if(node.val == y) depthY = level;
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        level++;
    }
    return depthX == depthY;
}
}
