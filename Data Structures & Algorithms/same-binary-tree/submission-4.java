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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(p);
        queue2.offer(q);

        if (queue1.isEmpty() && queue2.isEmpty()){
            return true;
        }
        else if (queue1.isEmpty() || queue2.isEmpty()){
            return false;
        }
        else if (queue1.size() != queue2.size()){
            return false;
        }

        while (!queue1.isEmpty()){
            TreeNode one = queue1.poll();
            TreeNode two = queue2.poll();

            if (one == null && two == null){
                continue;
            }
            if (one == null || two == null){
                return false;
            }
            if (one.val != two.val){
                return false;
            }

            queue1.offer(one.left);
            queue1.offer(one.right);
            queue2.offer(two.left);
            queue2.offer(two.right);
        }

        return queue1.isEmpty() && queue2.isEmpty();
    }
}
