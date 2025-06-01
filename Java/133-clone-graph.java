/*  Given a reference of a node in a connected undirected graph.
Return a deep copy (clone) of the graph.
Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
class Node {
    public int val;
    public List<Node> neighbors;
}
 
Test case format:
For simplicity, each node's value is the same as the node's index (1-indexed). For example, the first node with val == 1, the second node with val == 2, and so on. The graph is represented in the test case using an adjacency list.
An adjacency list is a collection of unordered lists used to represent a finite graph. Each list describes the set of neighbors of a node in the graph.
The given node will always be the first node with val = 1. You must return the copy of the given node as a reference to the cloned graph.
 */


 class Solution {
    public Node cloneGraph(Node node) {
        //base case
        if( node == null) return null;

        Node copy = new Node(node.val); // create a new node with the same value as a given node
        Node[] visited = new Node[101]; //create an array of Node(not boolean) , because we have to add all the adjacent nodes of particular vertex, whether it's visited or not, so in the Node[] initially null is stored, if that node is visited, we will store the respective node at the index, and can retrieve that easily
        dfs(node, copy, visited);
        return copy;
    }
     
    public void dfs(Node node, Node copy, Node[] visited) {
        visited[copy.val] = copy; //store the current node at it's val index which will tell us that this node is now visited
        // now traverse for the adjacent nodes of root node
        for(Node n : node.neighbors) {
            //check if the node is visited
            if(visited[n.val] == null) {
                //it's not visited, create a new node
                Node newNode = new Node(n.val);
                //add this node as a neighbour of a prev copied node
                copy.neighbors.add(newNode);
                //make dfs call for this unvisited node to discover whether it's adjacent nodes are explored or not
                dfs(n, newNode, visited);
            } else {
                //if that node is already visited, retrieve that node from visited array and add it as the adjacent node of prev copied node
                copy.neighbors.add(visited[n.val]);
            }
        }
    }

 }
 