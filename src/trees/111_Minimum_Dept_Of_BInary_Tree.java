/**
 * Problem: 111. Minimum Depth of Binary Tree
 * Approach: Tree DFS (Recursion)
 * Time Complexity: O(N) - In the worst case, we visit every node in the tree.
 * Space Complexity: O(N) in the worst case (completely unbalanced tree) due to the recursion stack,
 * or O(log N) in the best case (perfectly balanced tree).
 */

package trees;
class Solution_111 {
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

    public int minDepth(TreeNode root) {

        if(root == null)
            return 0;

        if(root.left == null)
        {
            int RightNode = minDepth(root.right);

            return RightNode + 1;
        }
        if(root.right == null)
        {
            int LeftNode = minDepth(root.left);

            return LeftNode + 1;
        }



        int LeftNode = minDepth(root.left);
        int RightNode = minDepth(root.right);

        return Math.min(LeftNode,RightNode) + 1;

    }
}