// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree


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
// Approach:-
//  We pick the middle element to make a root and create a root node
// Take left side of middle array pass them recursively to get left sub tree
// use right side element to get right sub tree
// Connect these sub tree with root node and simply return root node
// -->Inorder traversal of binary search tree outputs the value in sorted order
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums , 0 ,nums.length-1);
        
    }
    private TreeNode createBST(int nums[] , int left , int right)
    {
        if(left > right)
        {
            return null;
        }
        int m =(right+left)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = createBST(nums,left,m-1);
        root.right = createBST(nums,m+1,right);
        return root;
    }
}
