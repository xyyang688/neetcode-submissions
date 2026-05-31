/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Map<Node, Node> map = new HashMap<>();
        return dfs(node, map);
    }

    private Node dfs(Node node, Map<Node, Node> map){
        if (node == null){
            return null;
        }

        // if the node has been visited, return to the copy
        if (map.containsKey(node)){
            return map.get(node);
        }

        // for the node that has not been visited
        // create a copy of the current node
        Node copy = new Node(node.val);
        map.put(node, copy);

        // for every neighbor, copy node with dfs
        for (Node nei: node.neighbors){
            // fill the neighbors of the copy
            copy.neighbors.add(dfs(nei, map));
        }

        return copy;
    }
}