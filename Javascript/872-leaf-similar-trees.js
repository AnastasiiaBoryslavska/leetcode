/**
Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

Example 1:
Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true
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
 * @param {TreeNode} root1
 * @param {TreeNode} root2
 * @return {boolean}
 */
var leafSimilar = function(root1, root2) {
    

    let helper = function(root, leaves) {

        if(!root.left && !root.right){
            leaves.push(root.val)
            return 

        }

        if(root.left) {
            helper(root.left, leaves)
        }

        if(root.right) {
            helper(root.right, leaves)
        }

    }

    const leaves1 = []
    const leaves2 = []

    helper(root1, leaves1)
    helper(root2, leaves2)

 

    const compareArrays = (a,b) => 
        a.length === b.length && a.every((element, index) => element === b[index])


    return compareArrays(leaves1, leaves2)
};
