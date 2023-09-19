// https://leetcode.com/problems/balanced-binary-tree





class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        {
            return true; // An empty tree is considered balanced
        }
       int left = depth(root.left);
       int right = depth(root.right);
         // Check the balance condition and recurse for left and right subtrees
//because we have to check the balance of each node
       return Math.abs(left-right) <=1 && isBalanced(root.left) && isBalanced(root.right);
        
    }
    // Helper function to calculate the depth of a tree
    public int depth(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max(depth(root.left) , depth(root.right))+1;
    }
}
