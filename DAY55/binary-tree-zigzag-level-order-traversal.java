// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal



class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

//level order traversal
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
        {
            return list;
        }
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


//reversing the odd index list
        for(int i=0;i<list.size();i++)
        {
            if(i%2 !=0)
            {
                Collections.reverse(list.get(i));
            }
        }
        return list;
        
    }
}






