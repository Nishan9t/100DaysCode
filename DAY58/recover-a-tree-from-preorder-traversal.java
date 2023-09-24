// https://leetcode.com/problems/recover-a-tree-from-preorder-traversal



class Solution {
    public int i =0;
    public TreeNode recoverFromPreorder(String traversal) {
       char[] str = traversal.toCharArray();
       return helper(str,0);
    }
    public TreeNode helper(char[] str , int d)
    {
        if(i >=str.length)
        {
            return null;
        }
        int dep =0;
        while(str[i+dep]=='-')
        {
            dep++;
        }
        if(d != dep)
        {
            return null;
        }
        i +=dep;
        int digit =0;
        while(i < str.length && str[i] !='-')
        {
            digit =digit*10 + str[i]-'0';
            i++;
        }
        TreeNode root = new TreeNode(digit);
        root.left = helper(str,d+1);
        root.right=helper(str,d+1);
        return root;
    }
}
