// https://leetcode.com/problems/invert-binary-tree/


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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
        {
            return null;
        }
        //at first swapping child of root node only
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        //for swapping child of each parent node
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }
}


