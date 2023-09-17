// https://leetcode.com/problems/symmetric-tree/


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
    public boolean isSymmetric(TreeNode root) {
        
        return helper(root,root);
        
    }
    public boolean helper(TreeNode leftTree , TreeNode rightTree)
    {
        if(leftTree == null && rightTree == null)
        {
            return true;
        }
        if(leftTree !=null && rightTree!=null && leftTree.val == rightTree.val)
        {
            //process more for symmetric
            Boolean b1 = helper(leftTree.left,rightTree.right);
            Boolean b2 = helper(leftTree.right,rightTree.left);
            return b1 && b2;
        }
        return false;
    }
}
