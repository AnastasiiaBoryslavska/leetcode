/**
 Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.
 Example 1:
 Input: root = [4,2,6,1,3]
 Output: 1
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
 * @return {number}
 */
var getMinimumDifference = function(root) {
    //     Converting tree to an sorted array
        const arr = toArray(root);
        let out = Infinity;
        let i = 1;
    //     Now, simply finding the difference
        while(i<arr.length){
            let diff = Math.abs(arr[i-1]- arr[i]);
            if(diff<out) out = diff;
            i++;
        }
        return out;
    };
    
    function toArray(root, out=[]){
        if(root){
            toArray(root.left, out);
            out.push(root.val);
            toArray(root.right, out);
            return out;
        }
    }
