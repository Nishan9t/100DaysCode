// https://leetcode.com/problems/binary-tree-inorder-traversal





class Solution {
    public List<Integer> li = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
       if(root == null)
       {
          return new LinkedList<>();
       }
        inorderTraversal(root.left);
        li.add(root.val);
        inorderTraversal(root.right);
        return li;
                
    }
}


