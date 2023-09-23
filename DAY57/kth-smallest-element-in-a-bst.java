// https://leetcode.com/problems/kth-smallest-element-in-a-bst



class Solution {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        for(int i=0;i<k-1;i++)
        {
            pq.poll();
        }
        return pq.peek();
    }
    public void inorder(TreeNode root)
    {
        if(root == null)
        {
            return ;
        }
        inorder(root.left);
        pq.add(root.val);
        inorder(root.right);
    }
}
