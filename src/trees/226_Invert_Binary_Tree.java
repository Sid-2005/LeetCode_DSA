/**
 * Problem: 226. Invert Binary Tree
 * Approach: Tree DFS (Recursion)
 * Time Complexity: O(N) - We visit every single node in the tree exactly once to swap its children.
 * Space Complexity: O(N) in the worst case (a completely unbalanced, straight-line tree) due to the recursion stack, or O(log N) for a balanced tree.
 */

package trees;

class Solution_226 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root) {

        if(root == null)
            return root;

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }
}