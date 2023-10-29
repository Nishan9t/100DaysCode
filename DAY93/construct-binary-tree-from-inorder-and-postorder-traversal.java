// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal




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
    int postOrderIndex;
    Map<Integer,Integer> inorderIndexUmp;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postOrderIndex = postorder.length-1;
        inorderIndexUmp=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            inorderIndexUmp.put(inorder[i],i);
        }
        return buildTreeHelper(postorder,0,postorder.length-1);

    }
    public TreeNode buildTreeHelper(int[] postorder, int left , int right)
    {
        if(left>right)
        {
            return null;
        }
        int rootValue = postorder[postOrderIndex--];
        TreeNode root = new TreeNode(rootValue);
        int inorderPivotIndex= inorderIndexUmp.get(rootValue);
        root.right=buildTreeHelper(postorder,inorderPivotIndex+1,right);
        root.left=buildTreeHelper(postorder,left,inorderPivotIndex-1);
        return root;
    }
}
