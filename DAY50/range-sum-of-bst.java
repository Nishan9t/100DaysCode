// https://leetcode.com/problems/range-sum-of-bst/


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
    private int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null)
        {
            return 0;
        }
        if(root.val>=low && root.val<=high)
        {
            sum+=root.val;
        }
        //since its BST
        //all left node of parent node should be smaller than parent node
        //and all right node should be greater than parent node
        if(root.val >low)
        {
            rangeSumBST(root.left,low,high);
        }
        if(root.val<high)
         {
           rangeSumBST(root.right,low,high);
          }
        
        return sum;
        
    }
}
