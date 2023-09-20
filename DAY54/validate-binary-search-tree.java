// https://leetcode.com/problems/validate-binary-search-tree




class Solution {

 ArrayList<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root)
    {
        inorder(root);
        for(int i=1;i<list.size();i++)
        {
            int cur = list.get(i);
            int prev = list.get(i-1);
            if(prev >= cur)
            {
                return false;
            }
        }
        return true;
        
    }
    public void inorder(TreeNode root)
    {
        if(root == null)
        {
            return ;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

}






