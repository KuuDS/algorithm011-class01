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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>(preorder.length);
        for (int i = 0; i < inorder.length; ++i) {
            map.put(inorder[i], i);
        }
        return buildTree(map, preorder, inorder, 0, 0, preorder.length);
    }

    private TreeNode buildTree(Map<Integer, Integer> map, int[] preorder, int[] inorder, int pre_start, int in_start, int length) {
        if (length <= 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[pre_start]);
        int in_root = map.get(root.val);
        int leftLength = in_root - in_start;
        int rightLength = in_start + length - in_root - 1;
        root.left= buildTree(map, preorder, inorder, pre_start + 1, in_start, leftLength);
        root.right = buildTree(map, preorder, inorder, pre_start + 1 + leftLength , in_root + 1, rightLength);
        return root;
    }
}