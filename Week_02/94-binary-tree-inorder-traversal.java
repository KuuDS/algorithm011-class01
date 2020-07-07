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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        Stack stack = new Stack();

        TreeNode cursor = root;
        while(cursor !=null || !stack.isEmpty()) {
            while (cursor != null) {
                stack.push(cursor);
                cursor = cursor.left;
            }
            cursor = stack.pop();
            result.add(cursor.val);
            cursor = cursor.right;
        }

        return result;
    }

    public static class Stack {

        List<TreeNode> data = new ArrayList<>();
        int size = 0;

        void push(TreeNode e) {
            data.add(size, e);
            size++;
        }

        TreeNode pop() {
            size--;
            return data.get(size);
        }

        boolean isEmpty() {
            return size == 0;
        }

    }
}