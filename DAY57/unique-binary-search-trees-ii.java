// https://leetcode.com/problems/unique-binary-search-trees-ii



class Solution {
    public List<TreeNode> generateTrees(int n) {
        return ways(1,n);
        
    }
    private List<TreeNode> ways(int start , int end)
    {
        List<TreeNode> list = new ArrayList<>();
        if(start > end)
        {
            list.add(null);
            return list;
        }
        for(int i=start ; i<=end;i++)
        {
            List<TreeNode> left = ways(start,i-1);
            List<TreeNode> right = ways(i+1,end);
            for(TreeNode l :left)
            {
                for(TreeNode r:right)
                {
                    TreeNode node = new TreeNode(i);
                    node.left=l;
                    node.right=r;
                    list.add(node);
                }
            }
        }
        return list;
    }
}
