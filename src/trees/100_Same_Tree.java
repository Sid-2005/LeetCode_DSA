/**
 * Problem: 100. Same Tree
 * Approach: Tree DFS (Recursion) - Simultaneous Traversal
 * Time Complexity: O(N) - Where N is the number of nodes in the smaller tree, since we must visit each node.
 * Space Complexity: O(N) in the worst case (unbalanced tree) due to recursion stack, or O(log N) in a balanced tree.
 */

package trees;
class Solution_100 {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if ( p == null &&  q == null) {
            return true;
        }

        if ( p.equals(q) ) {
            return false;
        }

        if (p.val != q.val ) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}