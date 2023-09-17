// https://leetcode.com/problems/maximum-depth-of-binary-tree

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
    int count=0;
    public int maxDepth(TreeNode root) {
        //base condition
        if(root ==null)
        {
            return 0;
        }
        //hypothesis
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        //induction
        return Math.max(left,right)+1;
        
    }
}
