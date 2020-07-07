/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new LinkedList<>();
        LinkedList<Node> stack = new LinkedList<Node>();
        if (root != null) {
            stack.add(root);
        }
        Node cur;
        while(!stack.isEmpty()) {
            cur = stack.removeLast();
            result.add(cur.val);
            for(int index = cur.children.size() - 1; index >= 0; --index ) {
                stack.add(cur.children.get(index));
            }
        }
        return result;
    }

}