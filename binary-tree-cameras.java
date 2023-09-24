// https://leetcode.com/problems/binary-tree-cameras



class Solution {
    int res =0;
    public int minCameraCover(TreeNode root) {
        return (dfs(root) < 1 ? 1 : 0)+res;
        
    }
    public int dfs(TreeNode root)
    {
        if(root == null)
        {
            return 2;
        }
        int left = dfs(root.left) ;
        int right = dfs(root.right);
        // even if one needs a camera then I put a camera
        if(left ==0 || right == 0)
        {
            res++;
            return 1;
        }
        // even if one has a camera then I'm safe
        //else both are surveilled then I need a camera
        return left == 1 || right == 1 ? 2 : 0;
    }
}


