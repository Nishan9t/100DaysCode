// https://leetcode.com/problems/count-good-nodes-in-binary-tree




class Solution {
     int ans =0;
    public int goodNodes(TreeNode root) {
         dfs(root,Integer.MIN_VALUE);
         return ans;
    }
    public void dfs(TreeNode root, int maxNode)
    {
        if(root == null)
        {
            return ;
        }
        maxNode = Math.max(maxNode , root.val);
        if(root.val >= maxNode)
        {
            ans++;
        }
        dfs(root.left ,maxNode);
        dfs(root.right,maxNode);
    }
}


