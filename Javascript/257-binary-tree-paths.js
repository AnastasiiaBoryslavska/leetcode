/**
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children. 

Example 1:
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
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
 * @return {string[]}
 */
var binaryTreePaths = function(root) {
	// If null return an empty array
    if (root === null) return [];
	// If no children return the nodes value itself as a string within an array
    else if (root.left === null && root.right === null) return [`${root.val}`];
    else {
		// For all child paths add the root to their head one by one.
        let left = binaryTreePaths(root.left).map(x => root.val + '->' + x);
        let right = binaryTreePaths(root.right).map(x => root.val + '->' + x);
		
		// return the array with the root value attached
        return [...left, ...right];
    }
};
