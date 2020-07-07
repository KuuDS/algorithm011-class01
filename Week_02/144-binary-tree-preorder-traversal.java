/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        // init
        LinkedList<Integer> result = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();

        // init cursor
        if (root != null) {
            stack.addLast(root);

        }
        // loop
        TreeNode cursor;
        while (!stack.isEmpty()) {
            cursor = stack.removeLast();
            result.add(cursor.val);
            if(cursor.right != null) {
                stack.add(cursor.right);
            }
            if(cursor.left != null) {
                stack.add(cursor.left);
            }
        }

        // return
        return result;
    }
}