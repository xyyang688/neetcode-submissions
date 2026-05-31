/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> arr = new ArrayList<>();

        dfs(root, arr);
        return arr.get(k-1);
    }

    public void dfs(TreeNode node, List<Integer> array){
        if (node == null){
            return;
        }

        if (node.left != null){
            dfs(node.left, array);
        }
        array.add(node.val);
        if (node.right != null){
            dfs(node.right, array);
        }
    }
}
