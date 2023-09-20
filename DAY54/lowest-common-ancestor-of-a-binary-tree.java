// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree




class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root ==p || root ==q)
        {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left , p , q);
        TreeNode right = lowestCommonAncestor(root.right , p , q);
        //if left subtree does not contains another descdenants 
        //that means current node have the descedents of another
        if(left == null )
        {
            return right;
        }
        //if it not in right of node
        //then it will be down to the found node
        else if(right == null)
        {
            return left;
        }
        else
        {
            return root;
        }
        
        
    }
}




