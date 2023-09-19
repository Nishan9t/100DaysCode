// https://leetcode.com/problems/binary-tree-inorder-traversal




class Solution {
   

 public List<Integer> inorderTraversal(TreeNode root) {
        
       List<Integer> list = new ArrayList<>();
       Stack<TreeNode> stack = new Stack<>();
       TreeNode cur = root;
         while(cur !=null || !stack.empty())
        {
            while(cur !=null)
                {
                    stack.add(cur);
                    cur=cur.left;
                }
            //make leaf node as current node 
            cur = stack.pop();
            list.add(cur.val);


//if popped node have right child then traverse them

            cur = cur.right;
        }     
        return list;     
                
    }
}


