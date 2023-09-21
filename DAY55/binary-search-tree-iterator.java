// https://leetcode.com/problems/binary-search-tree-iterator



class BSTIterator {
    private Stack<TreeNode> st = new Stack<>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
        
    }
    
    public int next() {
        TreeNode tempNode = st.pop();
        pushAll(tempNode.right);
        return tempNode.val;
        
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
        
    }
//pushing all left node to stack
    private void pushAll(TreeNode node)
    {
        while(node !=null)
        {
            st.push(node);
            node=node.left;
        }
    }
}







