// https://leetcode.com/problems/binary-tree-level-order-traversal



class Solution {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
        {
            return list;
        }
        //queue will contain the nodes fron left to right
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr = q.poll();
                l.add(curr.val);
                if(curr.left !=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
            list.add(l);
        }
        return list;
    }
}







