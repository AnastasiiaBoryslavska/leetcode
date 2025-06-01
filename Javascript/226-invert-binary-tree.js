
var invertTree = function(root) {
    if(!root ) return root;
    let left = root.left;
    root.rigth = invertTree(root.left);
    root.left = invertTree(left);
    return root;
}