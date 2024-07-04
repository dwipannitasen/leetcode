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
    public int maxPathSum(TreeNode root) {
        int[] maxi = {Integer.MIN_VALUE};
        findMaxSum(root, maxi);
        return maxi[0];
    }

    public int findMaxSum(TreeNode root, int[] maxi){
        if(root == null) return 0;

        int leftMaxSum = Math.max(0, findMaxSum(root.left, maxi));
        int rightMaxSum = Math.max(0, findMaxSum(root.right, maxi));

        maxi[0] = Math.max(maxi[0], leftMaxSum + rightMaxSum + root.val);

        return Math.max(leftMaxSum, rightMaxSum) + root.val;
    }
}