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
        int a[] = new int[1];
        a[0] = Integer.MIN_VALUE;
        findMax(a,root);
        return a[0];
    }
    public int findMax(int a[], TreeNode root)
    {
        if(root == null) return 0;
        int left = Math.max(0,findMax(a,root.left));
        int right = Math.max(0,findMax(a,root.right));
        a[0] = Math.max(a[0],left + right + root.val);
        return Math.max(left,right)+root.val;
    }
}